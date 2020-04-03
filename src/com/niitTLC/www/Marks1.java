package com.niitTLC.www;
import java.util.*;
import java.lang.*;

		public class Marks1
		{
		    static class SortByMark implements Comparator<Student>
		    {
		        @Override
		        public int compare(Student studentOne, Student studentTwo)
		        {
		            return studentOne.mark.compareTo(studentTwo.mark);
		        }
		    }

		    static class Student
		    {
		        private final Double mark;
		        private final String name;
		        private final int roll_no;
		        private final String course;

		        public Student(String name,int roll_no,String course, Double mark)
		        {
		            this.name = name;
		            this.roll_no = roll_no;
		            this.course= course;
		            this.mark = mark;
		        }

		        public Double getMark()
		        {
		            return mark;
		        }

		        public String getName()
		        {
		            return name;
		        }
		        public String getCourse(){
		        	return course;
		        }
		        public int roll_no(){
		        	return roll_no;
		        }
		       
		        public String toString()
		        {
		            return name + ": " + mark + ":"+course +":"+ roll_no;
		        }
		    }

		    private final static SortByMark sortByMark = new SortByMark();;

		    public static void main(String args[])
		    {
		        List<Student> students = new ArrayList<Student>();

		        students.add(new Student("Zara",1,"MCA",new Double(3434.34)));
		        students.add(new Student("Mahnaz",2,"BCA", new Double(123.22)));
		        students.add(new Student("Ayan", 3,"BSC",new Double(1378.00)));
		        students.add(new Student("Daisy",4,"MSC", new Double(99.22)));
		        students.add(new Student("Qadir",5,"BBA", new Double(-19.08)));

		        Collections.sort(students, sortByMark);

		        for (Student student : students)
		        {
		            System.out.println(student);
		        }
		    }
		}		
		
		
		
		
