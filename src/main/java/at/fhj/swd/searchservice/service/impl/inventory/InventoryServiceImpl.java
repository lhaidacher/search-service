package at.fhj.swd.searchservice.service.impl.inventory;

import at.fhj.swd.searchservice.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
class InventoryServiceImpl implements InventoryService {
    private static final ArticleMapper MAPPER = new ArticleMapper();
    private final InventoryClient client;

    @Autowired
    public InventoryServiceImpl(InventoryClient client) {
        this.client = client;
    }

    @Override
    public Set<Article> getArticles(String keyword) {
        return client.articles(keyword).stream()
                .map(MAPPER)
                .collect(Collectors.toSet());
    }
}
