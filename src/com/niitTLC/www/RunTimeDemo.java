package com.niitTLC.www;

public class RunTimeDemo {
	protected RunTimeDemo(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime objRun= Runtime.getRuntime();
		Process objProcess = null;
		try{
			objProcess =objRun.exec("Notepad.exe");
		}
		catch(Exception e){
			System.out.println("Error executing calculator");
		}
	}

}
