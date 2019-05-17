package webShop;

import webShop.stock.StockImport;
import webShop.stock.BigTableImport;
import webShop.stock.SmallCouchImport;
import webShop.stock.SmallTableImport;
import webShop.stock.BigCouchImport;
import java.util.ArrayList;
import java.util.List;

public class Stock implements StockImport {
	private StockImport si;
	private List<Article> stockList = new ArrayList<>();

	// Alternative contructors/Different parameters in the future for separate import?
	public Stock() {
		si = new SmallCouchImport();
		stockList.addAll(si.getStock());
		si = new BigCouchImport();
		stockList.addAll(si.getStock());
		si = new SmallTableImport();
		stockList.addAll(si.getStock());
		si = new BigTableImport();
		stockList.addAll(si.getStock());
	}
	
	/**
	 * @return the shoppingcart
	 */
	List<Article> getStockList() {
		return stockList;
	}

	@Override
	public List<Article> getStock() {
		// TODO Auto-generated method stub
		return null;
	}

}
