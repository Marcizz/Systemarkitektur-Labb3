package webShop;

import java.util.List;

public class PageController {

	private List<Article> stockList;
	private List<Article> shoppingCart;
	private PageView view;
	
	public PageController() {
		view = new PageView();
	}
	
	public Article getArticle() {
		return null ;
	}
	
	public void updateView() {
		view.updateView();
	}
}
