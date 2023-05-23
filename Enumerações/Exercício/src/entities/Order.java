package entities;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Instant moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	public Order() {
	}
	
	public Order(Instant moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public Instant getMoment() {
		return moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	//public List<OrderItem> getItems() {
		//return items;
	//}
	
	public Client getClient() {
		return client;
	}
	
	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double total = 0.0;
		for (OrderItem i: this.items) {
			total += i.subTotal();
		}
		return total;
	}
	
	public String toString() {
		LocalDateTime localMoment = LocalDateTime.ofInstant(moment, ZoneId.systemDefault());
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append(String.format("Order moment: %s%n", localMoment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))));
		sb.append(String.format("Order status: %s%n", status.toString()));
		sb.append(String.format("Client: %s (%s) - %s%n", this.client.getName(), this.client.getBirthday().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), client.getEmail()));
		sb.append("Order items: \n");
		for (OrderItem i: this.items) {
			sb.append(String.format("%s, %.2f, Quantity: %d, Subtotal: $%.2f%n", i.getProduct().getName(), i.getPrice(), i.getQuantity(), i.subTotal()));
		}
		sb.append(String.format("Total price: %.2f%n", this.total()));
		return sb.toString();
	}
}
