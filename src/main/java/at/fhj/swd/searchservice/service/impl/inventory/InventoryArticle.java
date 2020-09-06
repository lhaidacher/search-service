package at.fhj.swd.searchservice.service.impl.inventory;

import lombok.Data;

@Data
class InventoryArticle {
    private String ean;
    private String name;
    private String material;
    private String color;
    private String price;
}
