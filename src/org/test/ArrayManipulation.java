package org.test;

import java.util.*;

public class ArrayManipulation {
	public static void main(String[] args) {
		int a[] = { 10, 10, 20, 50, 60, 80, 60, 50 };
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
		
		
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		System.out.println(s);
		}

}

