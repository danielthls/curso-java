package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		String s3 = new String("Test");
		
		System.out.println("c1.hashCode: " + c1.hashCode());
		System.out.println("c2.hashCode: " + c2.hashCode());
		
		System.out.println("c1.equals(c2): " + c1.equals(c2));
		
		System.out.println("c1 == c2: " + (c1 == c2));
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1 == s3: " + (s1 == s3));
	}

}
