package org.test;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = sc.nextInt();
		int originalNum,rem,res=0;
		originalNum = input;
		while (originalNum != 0) {
		rem = originalNum%10;
		res = (int) (res + Math.pow(rem, 3));
		originalNum = originalNum/10;
					
		}
		if (input == res) {
			System.out.println("The given number "+input+ " is Amstrong Number");
			
		} else {
			System.out.println("The given number "+input+ " is not Amstrong Number");
		}sc.close();
	}

}
