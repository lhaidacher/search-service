package at.fhj.swd.searchservice.domain;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class SearchResultTest {
    @Test
    public void foo() {
        assertNotNull(SearchResult.generate("asd", new HashSet<>()));
    }
}