package Model;

import java.util.ArrayList;

public class Package {
	private String ID;
	private float weight;
	private Customer customer = new Customer();
	private Product product = new Product();
	private ArrayList<Product> products = new ArrayList<Product>();
	
	public void Add(Product p) {
		this.products.add(p);
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		this.ID = iD;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(String fullname, String id) {
		this.customer.setCustomerID(id);
		this.customer.setFullName(fullname);
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(String id, String name, float price) {
		this.product.setID(id);
		this.product.setName(name);
		this.product.setPrice(price);
	}
	
}
