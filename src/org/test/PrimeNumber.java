package org.test;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int num = sc.nextInt();
		int flag = 0;
		if(num ==0||num==1) {
			System.out.println("The given number " + num + " is not a prime number");
		}
		else {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println("The given number " + num + " is not a prime number");
				flag=1;
				break;
			}
		}
			if (flag == 0) 
				System.out.println("The given number " + num + " is a prime number");
			
				
			
			sc.close();
		}
	}
}
