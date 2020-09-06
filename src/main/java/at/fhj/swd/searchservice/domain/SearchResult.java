package at.fhj.swd.searchservice.domain;

import lombok.Getter;

import java.util.Set;

@Getter
public class SearchResult {
    private String keyword;
    private Integer hits;
    private Set<Article> articles;

    public static SearchResult generate(String keyword, Set<Article> articles) {
        SearchResult result = new SearchResult();

        result.keyword = keyword;
        result.hits = articles.size();
        result.articles = articles;

        return result;
    }
}
