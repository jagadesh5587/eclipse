package thirdLargest;

import java.util.Scanner;

public class LargerNumber {
	 static int  number(int[] i,int total) {
		int temp=0;
		for (int j = 0; j <total; j++) {
			for (int j2 = j+1; j2 < total; j2++) {
				if (i[j]<i[j2]) {
					temp=i[j];
					i[j]=i[j2];
					i[j2]=temp;
					
				}
			}
			
		}return i[total-6];
		
		
		
		
	}
	public static void main(String[] args) {
		int i[]=new int[8];
		Scanner sc1=new Scanner(System.in);
		for (int j = 0; j < i.length; j++) {
			 i[j]=sc1.nextInt();
			 
			
		}
		System.out.println(+number(i,8));
		
	}

}
