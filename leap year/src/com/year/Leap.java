package com.year;

import java.util.Scanner;

public class Leap {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		if (a % 4 == 0) {
			System.out.println("leap year");

		} else {
			System.out.println("this is not a leap year");
		}

	}

}
