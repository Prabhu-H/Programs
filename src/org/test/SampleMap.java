package org.test;

import java.util.*;


public class SampleMap {
public static void main(String[] args) {
	Map<Integer, String> m = new HashMap<>();
	m.put(10, "java");
	m.put(20, "sql");
	m.put(30, "oops");
	m.put(40, "Sql");
	m.put(50, "oracle");
	m.put(60, "DB");
	m.put(10, "selenium");
	m.put(50, "psql");
	m.put(40, "Hadoop");
	System.out.println(m);
	System.out.println(m.keySet());
	System.out.println(m.values());
	System.out.println(m.entrySet());
	for (java.util.Map.Entry<Integer, String> string : m.entrySet()) {
		System.out.println(string);
	}
	
	Map<Integer, Integer> m2 = new LinkedHashMap<>();
	m2.put(10, 10);
	m2.put(20, 20);
	m2.put(30, 30);
	m2.put(40, 40);
	m2.put(50, 50);
	m2.put(60, 60);
	m2.put(10, 10);
	m2.put(50, 50);
	m2.put(40, 40);
	System.out.println(m2);
	System.out.println(m2.keySet());
	System.out.println(m2.values());
	
	Map<String, Integer> m1 = new TreeMap<>();
	m1.put("!", 10);
	m1.put("@", 20);
	m1.put("#", 30);
	m1.put("$", 40);
	m1.put("%", 50);
	m1.put("^", 60);
	m1.put("&", 10);
	m1.put("*", 50);
	m1.put("(", 40);
	System.out.println(m1);
	System.out.println(m1.keySet());
	System.out.println(m1.values());
	
	Map<String, String> m3 = new Hashtable<>();
	m3.put("vel", "Selenium");
	m3.put("Ganesh", "framework");
	m3.put("Dinesh", "oracle");
	m3.put("Vengat", "corejava");
	m3.put("subash", "jira");
	System.out.println(m3);
	System.out.println(m3.keySet());
	System.out.println(m3.values());
}
}
