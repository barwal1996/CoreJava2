package com.niitTLC.www;
import java.io.*;
public class PushBackReaderExample {
	public static void main(String[] args)
	{
		String input = "This is an example of pushback reader";
		StringReader stringReader = null;
		PushbackReader pushbackReader = null;
		try{
			stringReader = new StringReader(input);
			pushbackReader = new PushbackReader(stringReader,20);

			//Read First character
			int ch = pushbackReader.read();
			System.out.println((char)ch);

			//Push Back first character
			pushbackReader.unread(ch);

			char[] c = new char[4];
			//Get first four characters
			pushbackReader.read(c);
			System.out.println(new String(c));

			//push back first four characters
			pushbackReader.unread(c,0,4);

			//Read all characters
			c =new char[input.length()];
			pushbackReader.read(c);
			System.out.println(new String(c,0,input.length()));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally{
			try{
				if(pushbackReader!=null){
					pushbackReader.close();
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
