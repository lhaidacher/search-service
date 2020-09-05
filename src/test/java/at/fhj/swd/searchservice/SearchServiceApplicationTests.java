package at.fhj.swd.searchservice;

import at.fhj.swd.searchservice.service.impl.SearchServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SearchServiceApplicationTests {

    @Test
    public void bar() {
        new SearchServiceImpl().getArticles("et");
    }

    @Test
    public void foobar() {
        new SearchServiceImpl().getTrendingKeywords();
    }

}
