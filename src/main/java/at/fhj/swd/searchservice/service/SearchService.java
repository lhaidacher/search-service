package at.fhj.swd.searchservice.service;

import at.fhj.swd.searchservice.domain.Article;

import java.util.List;
import java.util.Set;

public interface SearchService {
    List<Article> getArticles(String keyword);

    Set<String> getTrendingKeywords();
}
