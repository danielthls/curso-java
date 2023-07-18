package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		
		System.out.println("Total area: " + totalArea(myCircles));
		
		
		//COVARIÂNCIA
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = intList.get(0);
		
		//CONTRAVARIÂNCIA
		
		List<Object> testObjs = new ArrayList<>();
		testObjs.add("Maria");
		testObjs.add("Alex");
		
		List<? super Number> testNums = testObjs;
		testNums.add(10);
		testNums.add(3.14);
		
		printList(testNums);
		
		List<Integer> myInts = Arrays.asList(1,2,3,4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<>();
		
		copy(myInts, myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
		
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s: list) {
			sum += s.area();
		}
		return sum;
	}
	
	public static void printList(List<?> list) {
		for (Object obj: list) {
			System.out.println(obj);
		}
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destination) {
		for (Number s: source) {
			destination.add(s);
		}
	}
}
