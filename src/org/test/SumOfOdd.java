package org.test;

public class SumOfOdd {
	public static void main(String[] args) {
		System.out.println("Sum of ODD number is:");
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
				
			}
			System.out.println(sum);
		}
	}
}
