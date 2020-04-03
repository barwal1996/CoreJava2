package com.niitTLC.www;
import java.io.*;
public class WriteToFIle {
	public static void main(String[] args){
		try{
			FileWriter writer = new FileWriter("d:/names.txt",true);
			BufferedWriter bwr = new BufferedWriter(writer);
			bwr.write("Amit");
			bwr.newLine();
			bwr.write("Moksh");
			bwr.close();
			
			System.out.println("Succesfully written to file");
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
 