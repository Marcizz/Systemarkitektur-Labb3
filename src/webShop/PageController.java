package webShop;


public class PageController {

	private PageView view;
	private ShoppingCart shoppingCart;
	private Stock stock;
	
	public PageController() {
		view = new PageView();
		stock = new Stock();
		shoppingCart = new ShoppingCart();
	}
	
	public Article getArticle() {
		return null ;
	}
	
	public void updateView() {
		view.updateView(shoppingCart.getShoppingCart(), stock.getStockList());
	}
}
