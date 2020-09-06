package at.fhj.swd.searchservice.service.impl.inventory;

import at.fhj.swd.searchservice.domain.Article;

import java.util.function.Function;

class ArticleMapper implements Function<InventoryArticle, Article> {
    private static final String DESCRIPTION_TEMPLATE = "Color: %s, Material: %s";

    @Override
    public Article apply(InventoryArticle inventoryArticle) {
        Article article = new Article();

        article.setEan(inventoryArticle.getEan());
        article.setName(inventoryArticle.getName());
        article.setPrice(inventoryArticle.getPrice());
        article.setDescription(String.format(DESCRIPTION_TEMPLATE,
                inventoryArticle.getColor(),
                inventoryArticle.getMaterial()));

        return article;
    }
}
