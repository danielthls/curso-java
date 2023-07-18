package application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<>();
		
		
		myObjs = myNumbers; 
		
		Object obj;
		Integer x = 10;
		obj = x;
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria","Alex","Bob");
		printList(myStrs);
		
		//NÃO PERMITE ADICIONAR ITENS!!
	}

	public static void printList(List<?> list) {
		for (Object obj: list) {
			System.out.println(obj);
		}
	}
}
