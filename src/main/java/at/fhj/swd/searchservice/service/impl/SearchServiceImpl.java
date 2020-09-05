package at.fhj.swd.searchservice.service.impl;

import at.fhj.swd.searchservice.domain.Article;
import at.fhj.swd.searchservice.service.SearchService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SearchServiceImpl implements SearchService {
    @Override
    public List<Article> getArticles(String keyword) {
        return new ArrayList<Article>() {{
            add(new Article(131L, "iPhone"));
            add(new Article(34345L, "MacBook"));
            add(new Article(1235L, "Apple TV"));
            add(new Article(1235L, "New Toy TV"));
        }};
    }

    @Override
    public Set<String> getTrendingKeywords() {
        return new HashSet<String>() {{
            add("MacBook");
            add("iPhone");
        }};
    }
}
