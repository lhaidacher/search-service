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
        List<Article> articles = new ArrayList<>();

        articles.add(new Article(131L, "iPhone"));
        articles.add(new Article(34L, "Meine süße Laura <3"));

        return articles;
    }

    @Override
    public Set<String> getTrendingKeywords() {
        Set<String> trends = new HashSet<>();

        trends.add("MacBook");
        trends.add("iPhone");

        return trends;
    }
}
