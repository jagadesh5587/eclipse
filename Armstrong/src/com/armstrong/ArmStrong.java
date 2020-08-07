package com.armstrong;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int a=sc1.nextInt();
		int d=a;
		int sum=0,c=0;
		while(a!=0) {
			sum=a%10;
			c=c+sum*sum*sum;
			a=a/10;
			
			
			
		
			
		}if (c==d) 
			
		System.out.println("this is an armstrong number");
		
	else System.out.println("this not an armstrong number");
	}
		

}
