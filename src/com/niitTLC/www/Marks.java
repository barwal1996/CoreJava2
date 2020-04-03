package com.niitTLC.www;
//import java.lang.*;
import java.util.*;
public class Marks implements Comparable<Marks>{
	
int rollno;
String name;
int age;
Marks(int rollno, String name, int age){
this.rollno = rollno;
this.age = age;
this.name = name;
}

public int compareTo(Marks st){
	if(age== st.age)
		return 0;
	else if(age>st.age)
		return 1;
	else
		return -1;
}


	public static void main(String[] args){
		ArrayList<Marks> a1 = new ArrayList<Marks>();
		a1.add(new Marks(111,"Amit",234));
		a1.add(new Marks(222,"JOE",2));
		a1.add(new Marks(333,"LOY",24));
		
		Collections.sort(a1);
		for(Marks st:a1){
			System.out.println(st.rollno + " " +st.name + " "+st.age);
		}
	}
	}
