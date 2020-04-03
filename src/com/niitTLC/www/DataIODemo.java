package com.niitTLC.www;
import java.io.*;
public class DataIODemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args )throws IOException  {
		DataInputStream d = new DataInputStream(new FileInputStream("C:/abc/test.txt"));
		DataOutputStream out = new DataOutputStream(new FileOutputStream("test1.txt"));
		
		String count;
		while((count = d.readLine())!= null){
			String u = count.toUpperCase();
			System.out.println(u);
			out.writeBytes(u+ " ");
		}
		d.close();
		out.close();
		
	}

}
