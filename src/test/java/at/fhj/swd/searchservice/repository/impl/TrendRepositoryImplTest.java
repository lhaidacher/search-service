package at.fhj.swd.searchservice.repository.impl;

import at.fhj.swd.searchservice.domain.Trend;
import at.fhj.swd.searchservice.repository.TrendRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrendRepositoryImplTest {
    private TrendRepository repository;

    @BeforeEach
    public void init() {
        repository = new TrendRepositoryImpl();
    }

    @Test
    public void foo() {
        assertNotNull(repository.findAll());
    }

    @Test
    public void bar() {
        repository.save(new Trend());
    }
}