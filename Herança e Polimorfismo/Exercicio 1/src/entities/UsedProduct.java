package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	private LocalDate manufactureDate;
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	public LocalDate getManufactureDate() {
		return this.manufactureDate;
	}
	
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public final String priceTag() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%s (used) $ %.2f (Manufacture date: %s)",
							 this.name, this.price, this.manufactureDate.format(fmt));
	}
}
