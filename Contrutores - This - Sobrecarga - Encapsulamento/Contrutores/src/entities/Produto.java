package entities;

public class Produto {
	public String name;
	public double price;
	public int quantity;
	
	public Produto(String aName, double aPrice, int aQuantity) {
		this.name = aName;
		this.price = aPrice;
		this.quantity = aQuantity;
	}
	
	public Produto(String aName, double aPrice) {
		this.name = aName;
		this.price = aPrice;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

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
