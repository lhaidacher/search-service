package at.fhj.swd.searchservice.service;

import at.fhj.swd.searchservice.domain.SearchResult;
import at.fhj.swd.searchservice.domain.Trend;

import java.util.Set;

public interface SearchService {
    SearchResult search(String keyword);

    Set<Trend> getTrendingKeywords();
}
