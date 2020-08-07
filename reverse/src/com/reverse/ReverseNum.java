
package com.reverse;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		
	Scanner sc1=new Scanner(System.in);
	int a=sc1.nextInt();
	int rev=0,s,count=0;
	int c=a;
	while(a!=0) {
		s=a%10;
		rev=rev*10+s;
		a=a/10;
		
		
	}if (rev==c) {
		System.out.println("this is a palindrome");
		
	}else
		System.out.println("this is not a palindrome");
		
		
		
		
		
		
		
		
		
	}
	

}
