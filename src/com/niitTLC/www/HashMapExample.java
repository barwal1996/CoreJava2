/*
 * 
 * 
 Make a Hash Map that associates the following employee IDs with names. Keys 
 and values of Maps can be any Object type, so in real life you would probably
  have the key be a String and the associated value be a Person or Employee
   object. To make things simpler on this exercise, you can use String for 
   both the ID and the name, rather than bothering to create a Person or 
   Employee class. The point here is to associate keys with values, then 
   retrieve values later based on keys. 
 
 
  ID        Name
  a1234 Steve Jobs
  a1235 Scott McNealy 
  a1236 Jeff Bezos 
  a1237 Larry Ellison 
  a1237 Bill Gates 
 
 
 */

package com.niitTLC.www;
import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args)
	{
		HashMap<String, String> hmap = new HashMap<String, String>();

	      
	      Scanner in = new Scanner(System.in);

          for(int i=0;i<4;i++){

            String a=in.next();

           String b=in.next();
           hmap.put(a, b);

           System.out.println(hmap.get(a));
           
	      hmap.put("a1234", "Steve Jobs");
	      hmap.put("a1235", "Scott McNealy");
	      hmap.put("a1236", "Jeff Bezos");
	      hmap.put("a1237", "Larry Ellison");
	      hmap.put("a1237", "Bill Gates");
	      

	     
	      Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
	      
	      System.out.println("---------------------------------------");
	      /*get value based on keys */
	      String var= hmap.get("a1234");
	      String var1 = hmap.get("a1235");
	      String var2 = hmap.get("a1236");
	      String var3 = hmap.get("a1237");
	      String var4 = hmap.get("a1237");
	      
	      Set set2 = hmap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
	          System.out.println(mentry2.getValue());
	       }
	}
}
}
