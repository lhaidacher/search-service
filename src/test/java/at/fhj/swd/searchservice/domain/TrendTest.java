package at.fhj.swd.searchservice.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrendTest {
    @Test
    public void foo() {
        assertNotNull(Trend.generate("key", 3));
    }
}