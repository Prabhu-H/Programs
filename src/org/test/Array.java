package org.test;

import java.util.*;

public class Array {
public static void main(String[] args) {
	List<Integer> a1= new ArrayList<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(90);
	a1.add(10);
	a1.add(70);
	a1.add(40);
	a1.add(50);
	a1.add(10);
	a1.add(70);
	System.out.println(a1);
	System.out.println(a1.size());
	System.out.println(a1.indexOf(10));
	System.out.println(a1.lastIndexOf(10));
	System.out.println(a1.indexOf(50));
	System.out.println(a1.indexOf(90));
	System.out.println(a1.get(2));
	System.out.println(a1.remove(3));
	System.out.println(a1.lastIndexOf(10));
	System.out.println(a1.remove(7));
	System.out.println(a1);
	System.out.println(a1.set(2, 50));
	System.out.println("After adding 50 at 2nd Index :" +a1);
	a1.add(70);
	System.out.println(a1.set(3,100));
System.out.println("After replacing 70 to 700");
	for (int i = 0; i < a1.size(); i++) {
		if (a1.get(i) == 70) {
			a1.set(i, 700);
		}
		
	}
	System.out.println(a1);
	
	
	System.out.println("To get the List using For Loop:");
	for (int i = 0; i < a1.size(); i++) {
		System.out.println(a1.get(i));
	}
	System.out.println("Enhanced for loop");
	for (Integer l1 : a1) {
		System.out.println(l1);
	}
	System.out.println("Index of 10: ");
	for (int i = 0; i < a1.size(); i++) {
		if (a1.get(i)==10) {
			System.out.println(i);
		}
		
	}
		
	System.out.println("Index of 70: ");
	for (int i = 0; i < a1.size(); i++) {
		if (a1.get(i)==70) {
			System.out.println(i);
		} 
	}
	
	int  a[] = {1,2,3,4,5,6,7,8,9,10};
	
	int sum = 0;
	float avg;
	float l =  a.length;
	System.out.println("The length of the array a is:"+l);
	for (int i = 0; i < a.length; i++) {
		sum = sum + a[i];
	}
	avg = sum/l ;
	System.out.println("Sum is:" + sum);
	System.out.println("Avg is: "+ avg);
	
}}
	
	
	
	 