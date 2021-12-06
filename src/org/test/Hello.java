package org.test;
import java.util.Scanner;

public class Hello {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Age:");
	byte age = sc.nextByte();
	System.out.println("Your Age is:"+age);
	if (age<=18) {
		System.out.println("Not eligible to vote");
			
	}else {
		System.out.println("Eligible to vote");
	}
sc.close();
}
}	
