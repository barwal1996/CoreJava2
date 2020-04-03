package com.niitTLC.www;

import java.io.*;

public class SerializeDemo {

	public static void main(String[] args) {
		Employee13 e = new Employee13();
		e.name= "Joe";
		e.address= "Panwari ki shop, Delhi";
		e.SSN=1122333;
		e.number=101;
		try{
			FileOutputStream fileOut = new FileOutputStream("C:/abc/employee13.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in C:/abc/employee13.ser ");
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}

	}

}
