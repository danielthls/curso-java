package entities;

public final class ImportedProduct extends Product  {
	private Double customFee;
	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, double price, double customFee) {
		super(name, price);
		this.customFee = customFee;
	}
	
	public Double getCustomFee() {
		return this.customFee;
	}
	
	public void setCustomFee(double customFee) {
		this.customFee = customFee;
	}
	
	@Override
	public final String priceTag() {
		return String.format("%s $ %.2f (custom fee $ %.2f)", this.name, this.totalPrice(), this.customFee);
	}
	
	public Double totalPrice() {
		return this.price + this.customFee;
	}
}
