package at.fhj.swd.searchservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private String ean;
    private String name;
    private String description;
    private String price;
}
