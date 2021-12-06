package org.test;

import java.util.Scanner;

public class TriangleStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = rows - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j2 = 1; j2 <= i; j2++) {
				System.out.print("*" + " ");

			}
			System.out.println();
		}
		for (int i = rows; i >= 0; i--) {
			for (int j = rows - i; j >= 1; j--) {
				System.out.print(" ");
			}

			for (int j2 = 1; j2 <= i; j2++) {
				System.out.print("* ");

			}
			System.out.println();

		}sc.close();
	}

}
