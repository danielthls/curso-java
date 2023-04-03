package entities;

public class Produto {
	public String name;
	public double price;
	public double quantity;
	
	public String toString() {
		return this.name  	  
			+ ", $ "    	  
			+ String.format("%.2f", this.price)     
			+ ", "
			+ this.quantity  
			+ " units. Total: $ "
			+ String.format("%.2f", this.totalValueInStock());
		//System.out.print(name + ", $" + price + ", " + quantity);
	}
	
	public double totalValueInStock() {
		return (double) this.price * this.quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}
