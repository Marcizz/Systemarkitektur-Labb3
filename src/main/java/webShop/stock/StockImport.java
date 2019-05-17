package webShop.stock;

import java.util.List;
import webShop.Article;

public interface StockImport {
    List<Article> getStock(); // Get the stock for implementing class from db
}
