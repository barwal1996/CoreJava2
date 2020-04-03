package com.niitTLC.www;

public class GenericMethodTest {
	
	public static <E> void printArray(E[] inputArray){
		for(E element : inputArray){
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {1,2,3,4,5}; //Create arrays 
		Double[] doubleArray = {1.1,2.2,3.3,4.4};
		Character[] charArray ={'H','E','L','L','O'};
		System.out.println("Array integer contains ");
		printArray(intArray);
		
		System.out.println("Array doubleArray contains ");
		printArray(doubleArray);
		
		System.out.println("Array charArray contains ");
		printArray(charArray);

	}

}
