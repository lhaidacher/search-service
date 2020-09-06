package at.fhj.swd.searchservice.domain;

import lombok.Getter;

@Getter
public class Trend {
    private String keyword;
    private Integer hits;

    public static Trend generate(String keyword, Integer hits) {
        Trend trend = new Trend();

        trend.keyword = keyword;
        trend.hits = hits;

        return trend;
    }
}
