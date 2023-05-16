package entities;

import java.time.LocalDate;
import java.util.Date;

public class HourContract {
	private LocalDate date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {	
	}
	
	public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public Double getValuePerHour() {
		return this.valuePerHour;
	}
	
	public Integer getHours() {
		return this.hours;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double totalValue() {
		return this.valuePerHour * this.hours;
	}
	
	
}
