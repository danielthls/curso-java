package entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<OrderItem> items = new ArrayList();
	
	public List<OrderItem> getItems() {
		return this.items;
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
}


