package webShop;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Article> shoppingCart;
	
	public ShoppingCart() {
		shoppingCart = new ArrayList<>();
	}

	/**
	 * @return the shoppingCart
	 */
	List<Article> getShoppingCart() {
		return shoppingCart;
	}

	void addToShoppingCart(Article article) {
		shoppingCart.add(article);
	}
	
	public void purchaseCart() {
		
	}
}
