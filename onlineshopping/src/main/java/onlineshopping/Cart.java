package onlineshopping;

import java.util.List;

public class Cart {
	private List<Product> ProductList;
	private float total_amount;
	private boolean status;
	private boolean confirmOrder;
	public Cart(List<Product> ProductList, float total_amount, boolean status, boolean confirmOrder, User user) {
		super();
		this.ProductList = ProductList;
		this.total_amount = total_amount;
		this.status = status;
		this.confirmOrder = confirmOrder;
		
	}
	
	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public boolean isConfirmOrder() {
		return confirmOrder;
	}


	public void setConfirmOrder(boolean confirmOrder) {
		this.confirmOrder = confirmOrder;
	}
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}


	public List<Product> getProductList() {
		return ProductList;
	}


	public void setProductList(List<Product> productList) {
		ProductList = productList;
	}


	public float getTotal_amount() {
		return total_amount;
	}


	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}
	
	
}
