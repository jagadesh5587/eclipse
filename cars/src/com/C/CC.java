package com.C;

import java.util.Scanner;

public class CC {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int a=sc1.nextInt();
		int b=sc1.nextInt();
		int c=sc1.nextInt();
		if (a>b&&a>c) {
			System.out.println(a);
			
		}else if (b>c) {
			System.out.println(b);
			
		}else System.out.println(c);
		
	}

}
