package at.fhj.swd.searchservice.repository;

import at.fhj.swd.searchservice.domain.Trend;

import java.util.Set;

public interface TrendRepository {
    void save(Trend trend);

    Set<Trend> findAll();
}
