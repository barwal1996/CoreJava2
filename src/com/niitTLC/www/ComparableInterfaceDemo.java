package com.niitTLC.www;
import java.util.*;
class Employee implements Comparable<Employee13>
{
    String name;
    int age;
    int experience;
    
    public Employee(String name, int age, int experience)
    {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }
    
    public String toString() // LINE B
    {
        return "Name : " + name + " Age : " + age + " Experience : " + experience;
    }
    
    public int compareTo(Employee13 o) 
    {
        return experience - o.experience;
    }
}

public class ComparableInterfaceDemo
{

    public static void main(String[] args)
    {
        ArrayList list = new ArrayList(); 
        list.add(new Employee13("Siva", 35, 12));
        list.add(new Employee13("Maheesh", 25, 3));
        list.add(new Employee13("Narayan", 26, 2));
        list.add(new Employee13("Srinath", 24, 3));
        System.out.println(list);
        Collections.sort(list); 
        System.out.println(list);
    }
}