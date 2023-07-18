package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<>();
		
		set1.add("TV");
		set1.add("Tablet");
		set1.add("Notebook");
		set1.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println("===================");
		System.out.println("HashSet");
		
		System.out.println(set1.contains("Notebook"));
		
		for (String p: set1) {
			System.out.println(p);
		}
		
		Set<String> set2 = new TreeSet<>();
		
		set2.add("TV");
		set2.add("Tablet");
		set2.add("Notebook");
		set2.removeIf(x -> x.length() >= 3);
		
		System.out.println("===================");
		System.out.println("TreeSet");
		System.out.println(set2.contains("Notebook"));
		
		
		for (String p: set2) {
			System.out.println(p);
		}
		
		Set<String> set3 = new LinkedHashSet<>();
		
		set3.add("TV");
		set3.add("Tablet");
		set3.add("Notebook");
		System.out.println("===================");
		System.out.println("LinkedHashSet");
		System.out.println(set2.contains("Notebook"));
		
		set3.remove("Tablet");
		
		for (String p: set3) {
			System.out.println(p);
		}
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("c: " + c);
		
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("d: " + d);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("e: " + e);
	}

}
