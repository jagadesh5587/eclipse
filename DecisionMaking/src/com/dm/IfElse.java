package com.dm;

import java.util.Scanner;

public class IfElse {
double d;
public void j() {
Scanner sc1= new Scanner(System.in);
d=sc1.nextDouble();
if(d>=10.5&& d!=0)
System.out.println(d/10);
else
	System.out.println(d*10);
}
public static void main(String[] args) {
	IfElse k= new IfElse();
	k.j();
	int a=10,b=2;
	int c=(a>b)?(a+b):(a-b);
	System.out.println(c);
	
}
	


}
