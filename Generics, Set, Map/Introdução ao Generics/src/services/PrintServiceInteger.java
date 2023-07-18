package services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceInteger {
	
	private List<Integer> values = new ArrayList<>();
	
	public PrintServiceInteger() {
	}
	
	public void addValue(Integer value) {
		values.add(value);
	}
	
	public Integer getFirst() {
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
			sb.append(String.format(", %d", values.get(i)));
		}
		sb.append(']');
		return sb.toString();
	}
}
