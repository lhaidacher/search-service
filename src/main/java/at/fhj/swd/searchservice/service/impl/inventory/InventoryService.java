package at.fhj.swd.searchservice.service.impl.inventory;

import at.fhj.swd.searchservice.domain.Article;

import java.util.Set;

public interface InventoryService {
    Set<Article> getArticles(String keyword);
}
