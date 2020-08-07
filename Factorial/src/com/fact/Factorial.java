package com.fact;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int a= sc1.nextInt();
		int num=1;
		for (int i = 1; i <=a; i++) {
			num=num*i;
			
		}System.out.println(num);
	}

}
