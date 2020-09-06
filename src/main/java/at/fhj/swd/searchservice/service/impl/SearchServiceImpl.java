package at.fhj.swd.searchservice.service.impl;

import at.fhj.swd.searchservice.domain.Article;
import at.fhj.swd.searchservice.domain.SearchResult;
import at.fhj.swd.searchservice.domain.Trend;
import at.fhj.swd.searchservice.repository.TrendRepository;
import at.fhj.swd.searchservice.service.SearchService;
import at.fhj.swd.searchservice.service.impl.inventory.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SearchServiceImpl implements SearchService {
    private InventoryService service;
    private TrendRepository repository;

    @Autowired
    public SearchServiceImpl(InventoryService service, TrendRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @Override
    public SearchResult search(String keyword) {
        Set<Article> articles = service.getArticles(keyword);
        repository.save(Trend.generate(keyword, articles.size()));
        return SearchResult.generate(keyword, articles);
    }

    @Override
    public Set<Trend> getTrendingKeywords() {
        return repository.findAll();
    }
}
