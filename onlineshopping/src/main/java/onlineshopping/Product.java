package onlineshopping;

public class Product {
	
	private String product_name;
	private float price;
	private int quantity_in_stock;
	private String imagelocation;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String product_name, float price, int quantity_in_stock, String imagelocation) {
		super();
		this.product_name = product_name;
		this.price = price;
		this.quantity_in_stock = quantity_in_stock;
		this.imagelocation = imagelocation;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity_in_stock() {
		return quantity_in_stock;
	}

	public void setQuantity_in_stock(int quantity_in_stock) {
		this.quantity_in_stock = quantity_in_stock;
	}

	public String getImagelocation() {
		return imagelocation;
	}

	public void setImagelocation(String imagelocation) {
		this.imagelocation = imagelocation;
	}
	
}
