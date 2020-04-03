package com.niitTLC.www;
import java.util.*;
public class CollectionMethodsDemo {

	public static void main(String[] args) {
		// Create a list of strings

		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Java for developers");
		a1.add("Friends");
		a1.add("Dear");
		a1.add("Is");
		a1.add("Superb");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a1.add("Tomcat");
		a1.add("Jboss");
		
		
		Collections.copy(a1, a2);
		System.out.println("after copying" +a1);

		/* sort method here sorting the elements of ArrayList in ascending order  */
		Collections.sort(a1);
		System.out.println("List after the use of "+"Collection.sort() : \n" +a1);

		int pos= Collections.binarySearch(a1, "Superb");
		System.out.println("The position of \"Superb\" in Arraylist is  :" +pos);

		Collections.reverse(a1);
		System.out.println("List afet reversing " +a1);

		Collections.swap(a1, 4, 1);
		System.out.println("List after swaping "+a1);


	}

}
