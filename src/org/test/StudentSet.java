package org.test;

import java.util.*;

public class StudentSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set s = new LinkedHashSet();
		System.out.println("Enter the number of Student details to print: ");
		int num = sc.nextInt();
		for (int i = 1; i <=num; i++) {
			System.out.println("Enter the Emp ID:");
			int empId = sc.nextInt();
			s.add(empId);
			System.out.println("Enter the Emp Name: ");
			String name = sc.next();
			s.add(name);
		}
		
		
		
		
		System.out.println(s);
		sc.close();
	}

}
