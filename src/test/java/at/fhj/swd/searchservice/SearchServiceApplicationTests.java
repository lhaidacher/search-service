package at.fhj.swd.searchservice;

import at.fhj.swd.searchservice.repository.TrendRepository;
import at.fhj.swd.searchservice.service.impl.SearchServiceImpl;
import at.fhj.swd.searchservice.service.impl.inventory.InventoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SearchServiceApplicationTests {

    @Test
    public void bar() {
        new SearchServiceImpl(Mockito.mock(InventoryService.class), Mockito.mock(TrendRepository.class)).search("et");
    }

    @Test
    public void foobar() {
        new SearchServiceImpl(Mockito.mock(InventoryService.class), Mockito.mock(TrendRepository.class)).getTrendingKeywords();
    }

}
