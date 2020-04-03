package com.niitTLC.www;
import java.io.*;
public class InputStreamFileCopy {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("d:/country.txt");
			System.out.println(is.hashCode());
			OutputStream os = new FileOutputStream("c:/abc/countries.txt");
		  
		//	countries.available();
			byte[] buffer = new byte[1024];
			int bytesRead;
			//read from is to buffer
			while((bytesRead = is.read(buffer)) !=-1){
				os.write(buffer, 0, bytesRead);
			}
			System.out.println("File Copied");
			//System.out.println(is.available());
			is.close();
			//flush OutputStream to write any buffered data to file
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();      
		}   
	}
}
