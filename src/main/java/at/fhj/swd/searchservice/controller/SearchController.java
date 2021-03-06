package at.fhj.swd.searchservice.controller;

import at.fhj.swd.searchservice.domain.SearchResult;
import at.fhj.swd.searchservice.domain.Trend;
import at.fhj.swd.searchservice.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/searches")
public class SearchController {
    private SearchService service;

    @Autowired
    public SearchController(SearchService service) {
        this.service = service;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public SearchResult articles(@RequestParam("keyword") String keyword) {
        return service.search(keyword);
    }

    @GetMapping(path = "/trends", produces = MediaType.APPLICATION_JSON_VALUE)
    public Set<Trend> trends() {
        return service.getTrendingKeywords();
    }
}
