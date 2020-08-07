package com.search;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		int i[]= {20,21,54,65};
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		int h=0;
		for (int j = 0; j < i.length; j++) {
			if(i[j]==n)
				h=j;
				
			
		}System.out.println(h);
		
	}

}
