package com.reverse;

import java.util.Scanner;

public class Armstrong{
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int a=sc1.nextInt();
		int c,temp=1;
		while (a!=0) {
			c=a%10;
			temp=temp+c^3;
			a=a/10;
			
			
		}if (a==temp) 
			System.out.println("this is a armstrong number");
		}
		}
			
		
		
	
	
		
	
