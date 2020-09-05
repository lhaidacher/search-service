package at.fhj.swd.searchservice;

import at.fhj.swd.searchservice.service.impl.SearchServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SearchServiceApplicationTests {

    @Test
    public void foo() {
        new SearchServiceImpl().fancyMethodToReduceCoverage();
    }

}
