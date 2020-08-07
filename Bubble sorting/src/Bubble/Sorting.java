package Bubble;

import java.util.Scanner;

public class Sorting { 
	public static void number(int[] i) {
		int temp=0;
		for (int j = 0; j <7; j++) {
			for (int j2 = 0; j2 <7; j2++) {
				if (i[j2]>i[j2+1]) {
					temp=i[j2];
					i[j2]=i[j2+1];
					i[j2+1]=temp;
					
					
				}
				
			}
			
			
		}
		
		
		
		
	}
	public static void main(String[] args) {
		int[] i=new int [8];
		Scanner sc1=new Scanner(System.in);
		for (int j = 0; j <i.length; j++) {
			i[j]=sc1.nextInt();
			}
		number(i);
		for (int j = 0; j <i.length; j++) {
			System.out.println(+i[j]
			                      );
			}
		
		
		
	}
	
}


	
