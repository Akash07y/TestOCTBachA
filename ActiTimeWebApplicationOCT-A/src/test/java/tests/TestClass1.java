package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;

public class TestClass1 <G,T> {
	
	G a ;
	T s ;
	
	T test() {
		
		System.out.println(a);
		return s ;
	}

	public static void main(String[] args)  {
    
		TestClass1<String, Integer> h = new TestClass1<String,Integer>();
		
		h.a = "Velocity";
		h.s = 101;
		
		int d = h.test();
		
		System.out.println(d);

		TestClass1<String, Integer> g = new TestClass1<String,Integer>();
		
		TestClass1<Character, String> j = new TestClass1<Character,String>();
		
		TestClass1<String, Integer> l = new TestClass1<String,Integer>();
		
		
		
//	Hashtable<Character,String> htable= new Hashtable<Character,String>(); 
//	
//	htable.put('@', "Velocity");
//	htable.put('#', "Batch");
//	htable.put('h', null);
//	htable.put('F', "2021");
//	htable.put('A', "Velocity");
//	
//	for(Map.Entry<Character,String> e : htable.entrySet())
//	{
//		System.out.println("Key = " + e.getKey() + " Value = " + e.getValue());
//	}
//	System.out.println("=================================");
//	
//	htable.put('#', "Katraj");
//	
//	for(Map.Entry<Character,String> e : htable.entrySet())
//	{
//		System.out.println("Key = " + e.getKey() + " Value = " + e.getValue());
//	}
		       // Key   ,   value
//		HashMap<Character,String> hMap = new  HashMap<Character,String>();
//		
//		hMap.put('@', "Velocity");
//		hMap.put('#', null);
//		hMap.put(null, "Class");
//		hMap.put('F', "2021");
//		hMap.put('A', null);
//		
//		hMap.
//		
//		for(Map.Entry<Character,String> e : hMap.entrySet())
//		{
//			System.out.println("Key = " + e.getKey() + " Value = " + e.getValue());
//		}
//		System.out.println("=================================");
//		
//		hMap.put('#', "Katraj");
//		
//		for(Map.Entry<Character,String> e : hMap.entrySet())
//		{
//			System.out.println("Key = " + e.getKey() + " Value = " + e.getValue());
//		}
		
		
//		HashSet<String> h = new HashSet<String>();
//		
//		h.add("Velocity");
//		h.add("Batch");
//		h.add("Class");
//		h.add("2021");
//		h.add("Velocity");
//
//		int size = h.size();
//		System.out.println(size);
//		
//		Iterator<String> i = h.iterator();
//		
//		for(String s : h)
//		{
//			System.out.println(i.next());
//		}
//		
//		System.out.println("---------------");
//		
//		i = h.iterator();
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		ArrayList a = new ArrayList();
//		
//		a.add("Velocity");
//		a.add(125);
//		a.add('%');
//		a.add(125.365);
//		
//		int size = a.size(); // how many data in arralist
//		System.out.println(size);
//	
//		for(int i= 0 ; i < size ; i++)
//		{
//			System.out.println(a.get(i));
//		}
//		
//		a.remove(2);
//		System.out.println("-----------------------");
//		
//		size = a.size(); // how many data in arralist
//		System.out.println(size);
//		for(int i= 0 ; i < size ; i++)
//		{
//			System.out.println(a.get(i));
//		}
	}
	
	
	
//	final    -- keyword 
//	
//	finally   -- its block
//	
//	finallize()  -- abstract method  of object class
//	

	
	// No Exception = >  try -> finally --> normal flow of execution
}	// Exception handelled => try -> catch - > finally --> normal flow of execution 
    // Exception not handel = > try --> finally 
