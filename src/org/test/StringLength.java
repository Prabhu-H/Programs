package org.test;

import java.util.*;

public class StringLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "GreensTechnology";
		String s2 = "SeleniumAutomationTool";
		String s3 = "velmurugan";
		String s4 = "j a v a p r o g r a m";
		String s5 = "9095484678";

		int l1 = s1.length();
		int l2 = s2.length();
		int l3 = s3.length();
		int l4 = s4.length();
		int l5 = s5.length();

		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(l5);

		System.out.println("\n" + s1.lastIndexOf('o'));
		System.out.println(s2.indexOf('o'));
		System.out.println(s3.indexOf('n'));
		System.out.println(s4.lastIndexOf(' '));
		System.out.println(s5.indexOf('8'));

		System.out.println("\n" + s1.charAt(9));
		System.out.println(s2.charAt(11));
		System.out.println(s3.charAt(4));
		System.out.println(s4.charAt(8));
		System.out.println(s5.charAt(8));
		
		System.out.println("Enter the phone number");
		String mob = sc.next();
		System.out.println(mob.contains("N"));

//		System.out.println("\n" + s1.equals(s2));
//
//		System.out.println("Enter the Input String 1: ");
//		String string1 = sc.next();
//		System.out.println("Enter the Input String 2: ");
//		String string2 = sc.next();
//		System.out.println("\nUsing EqualsIgnoreCase");
//		
//
//		if (string1.equalsIgnoreCase(string2)) {
//
//			System.out.println("The given Strings are Equal");
//
//		} else {
//			System.out.println("The given Strings are not Equal");
//		}
//		System.out.println("\nUsing Equals");
//		
//		if (string1.equals(string2)) {
//
//			System.out.println("The given Strings are Equal");
//			
//			
//			
//
//		} else {
//			System.out.println("The given Strings are not Equal");
//		}
//		System.out.println("Enter the valid email ID: ");
//		String email = sc.next();
//		if (email.contains("@")) {
//			System.out.println("Valid Email");
//			
//		} else {
//System.out.println("Not Valid");
//		}
//		System.out.println("Enter the address: ");
//		String add = sc.nextLine();
//		if (add.contains("pincode")) {
//			System.out.println("Valid address");
//			
//		} else {
//System.out.println("Not Valid");
//		}
		sc.close();
	}
}