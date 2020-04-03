package com.niitTLC.www;
import java.io.*;
public class BufferedReaderExample {

	public static void main(String[] args) {
		
		try{
			BufferedReader br = new BufferedReader(new FileReader(new File("d:/country.txt")));
			String line = " ";
			br.skip(3);
			while((line= br.readLine())!=null){
				System.out.println(line);
			}
			br.close();
		}
		catch(FileNotFoundException e){
			System.out.println("file not exists or insufficient rights ");
			e.printStackTrace();
		}
		catch(IOException e){
			System.out.println("An exception occured");
		}

	}

}
