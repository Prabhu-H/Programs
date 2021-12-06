package org.test;
import java.util.*;

public class SampleSet{
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		System.out.println("The List is: "+l);
		Set<Integer> s = new HashSet<>();
		Set<Integer> s1 = new LinkedHashSet<>();
		Set<Integer> s2 = new TreeSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(10);
		s.add(20);
		System.out.println("The Hashset is: "+s);
		System.out.println("Enhanced forloop S");
		for (Integer integer : s) {
			System.out.println(integer);
			
		}
				
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(70);
		s1.add(80);
		s1.add(90);
		s1.add(10);
		s1.add(20);
		
		System.out.println("The Linked Hash Set is: "+s1);
		
		
		s2.add(10);
		s2.add(20);
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		s2.add(70);
		s2.add(80);
		s2.add(90);
		s2.add(10);
		s2.add(20);
		System.out.println("Tree Set is: "+s2);
		System.out.println("Enhanced forLoop of S2");
		
		for (Integer integer1 : s2) {
			System.out.println(integer1);
		}
		
		System.out.println("Adding the list to set: ");
		Set<Integer> s3 = new TreeSet<>();
		s3.addAll(l);
		System.out.println(s3);
//	System.out.println(s1.retainAll(s3));
//	System.out.println(s1);
	s3.removeAll(s2);
	System.out.println(s3);
	}
	
}
	
