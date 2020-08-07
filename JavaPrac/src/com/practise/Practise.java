package com.practise;

import java.util.Scanner;

public class Practise{

		public static void main(String args[]){
	@SuppressWarnings("resource")
	Scanner sc1= new Scanner(System.in);
	int temp=0;
	int x= sc1.nextInt();
	System.out.println("Enter the numbers: ");
	int array[]= new int[x];
	for (int i = 0; i < x; i++) {
		array[i]=sc1.nextInt();
	}
	for (int i = 0; i < x; i++) {
		for (int j = i; j < x; j++) {
			if (array[i]>array[j]) {
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				
			}
		}
		
		
	}for (int i = 0; i < x-1; i++) {
		
	}
		
	}
	





		}

		   
