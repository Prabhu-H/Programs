package org.test;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int count = sc.nextInt();
		System.out.println("The Fibonacci series upto " + count + "  is:");
		int n1 = 0;
		int n2 = 1;
		int n3=0;
		while ( n1<=count) {
			System.out.println(n1);
			n1=n2;
			n2=n3;
			n3=n1+n2;
			
		}
		sc.close();	
		}

	}