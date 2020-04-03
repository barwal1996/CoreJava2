package com.niitTLC.www;
import java.io.*;
//@SuppressWarnings("serial")
public class Employee13  implements Serializable{
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	public int experience;
	
	public Employee13(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public Employee13() {
		// TODO Auto-generated constructor stub
	}

	public void mailCheck(){
		System.out.println("Mailing a check to "+name + " "+address);
	}
}
