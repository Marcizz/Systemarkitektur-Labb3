package webShop;

import java.util.List;

public interface StockImport {
    List<Article> getStock(); // Get the stock for implementing class from db
}
