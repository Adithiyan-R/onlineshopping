package onlineshopping;

import java.util.List;

public class Order {
	
	private List<Cart> Cartlist;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public List<Cart> getCartlist() {
		return Cartlist;
	}

	public void setCartlist(List<Cart> cartlist) {
		Cartlist = cartlist;
	}

	public Order(List<Cart> cartlist) {
		super();
		Cartlist = cartlist;
	}
	
}
