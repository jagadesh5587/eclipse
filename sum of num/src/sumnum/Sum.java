package sumnum;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int a=sc1.nextInt();
		int num=0;
		int sum=0;
		while (a!=0) {
			sum=a%10;
			num=num+sum;
			a=a/10;
			
			
			
			
		}System.out.println(num);
		
	}

}
