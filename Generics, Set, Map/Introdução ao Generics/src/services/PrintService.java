package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	private List<T> values = new ArrayList<>();
	
	public PrintService() {
	}
	
	public void addValue(T value) {
		values.add(value);
	}
	
	public T getFirst() {
		if (values.isEmpty()) {
			throw new IllegalStateException("The list is empty");
		}
		return values.get(0);
	}
	
	public String print() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		if (!values.isEmpty()) {
			sb.append(values.get(0));
		}
		for (int i = 1; i < values.size(); i++) {
			sb.append(", " + values.get(i));
		}
		sb.append(']');
		return sb.toString();
	}
}
