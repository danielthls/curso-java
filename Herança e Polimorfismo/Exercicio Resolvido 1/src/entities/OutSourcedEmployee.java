package entities;

public class OutSourcedEmployee extends Employee {
	private Double additionalCharge;
	
	public OutSourcedEmployee() {
		super();
	}
	
	public OutSourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = (Double) additionalCharge;
	}
	
	public Double getAdditionalCharge() {
		return this.additionalCharge;
	}
	
	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + (additionalCharge * 110 / 100);
	}
}
