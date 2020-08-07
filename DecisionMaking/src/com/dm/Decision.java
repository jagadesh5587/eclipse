package com.dm;

import java.util.Scanner;

public class Decision {
int i;
public void n() {
Scanner sc1= new Scanner(System.in);
i=sc1.nextInt();
if(i>1000)
System.out.println(i*i);
}
public static void main(String[] args) {
	Decision g= new Decision();
	g.n();
	
}

	
	
	


}
