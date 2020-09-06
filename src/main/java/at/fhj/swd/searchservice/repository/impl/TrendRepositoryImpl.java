package at.fhj.swd.searchservice.repository.impl;

import at.fhj.swd.searchservice.domain.Trend;
import at.fhj.swd.searchservice.repository.TrendRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class TrendRepositoryImpl implements TrendRepository {
    private Set<Trend> trends = new HashSet<>();

    @Override
    public void save(Trend trend) {
        trends.add(trend);
    }

    @Override
    public Set<Trend> findAll() {
        return trends;
    }
}
