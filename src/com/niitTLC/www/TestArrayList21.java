package com.niitTLC.www;
import java.util.*;
public class TestArrayList21 {

	public static void main(String[] args) {
		
		List<String> a1= new ArrayList<String>(); //creating arraylist
		a1.add("JIM");
		a1.add("Mike");
		a1.add("Raj");
		a1.add("Rock");
		
		//Traversing
		Iterator itr = a1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
