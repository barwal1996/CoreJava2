package com.niitTLC.www;
import java.util.*;
public class TestCollection8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("JIM");
		a1.add("ROY");
		a1.add("SID");
		a1.add(1,"RAJ");
		System.out.println("Element at 2nd position "+a1.get(2));

		ListIterator<String> itr = a1.listIterator(a1.size());
		/*
		System.out.println("Traversing element in forward direction ");
		while(itr.hasNext()){
			System.out.println(itr.next());

		}
		*/
		System.out.println("traversing element in backward direction ");
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}

}
