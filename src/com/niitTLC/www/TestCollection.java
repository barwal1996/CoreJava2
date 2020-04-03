package com.niitTLC.www;

import java.util.*;
class TestCollection{
	public static void main(String[] args){
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("JOHN");
		queue.add("raj");
		queue.add("RAJU");
		queue.add("JOE");
		
		System.out.println("head :"+queue.element());
		System.out.println("head: "+queue.peek());
		System.out.println("Iterating the queue elements ");
		
		Iterator itr =queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		queue.remove();
		queue.poll();
		System.out.println("After removing two elements ");
		Iterator<String> itr2 = queue.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	}
}