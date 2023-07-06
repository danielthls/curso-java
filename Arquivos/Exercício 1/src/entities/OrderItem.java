package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public Integer getQuantity() {
		return this.quantity;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double subTotal() {
		return (double) price * quantity;
	}
	
	public String toString() {
		return String.format("%s; %.2f;%d", this.product.getName(), this.price, this.quantity);
	}
}
