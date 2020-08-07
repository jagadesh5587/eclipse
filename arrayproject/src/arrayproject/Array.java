package arrayproject;

import java.util.ArrayList;
import java.util.Vector;

public class Array{
	public static void main(String[] args) {
		ArrayList<String> List =new ArrayList<String>();
		List.add("10");
		List.add("20");
		List.add("10");
		List.add("20");
		System.out.println(List);
	int size = List.size();
	System.out.println(size);
	int indexOf = List.indexOf("20");
	System.out.println(indexOf);
			int lastIndexOf = List.lastIndexOf("10");
			System.out.println(lastIndexOf);
			Object object = List.get(3);
			System.out.println(object);
			System.out.println("each value of the list: ");
for (Object x : List) {
	System.out.println(x);
}
List.remove(2);
System.out.println(List);
List.add("50");
System.out.println(List);
List.add("2");
System.out.println(List);
Vector<Integer> list=new Vector<Integer>();
list.add(40);
list.add(41);
list.add(40);
list.add(42);
list.add(40);
for (int i = 0; i < list.size(); i++) {
	if (i==40)
		
		
		
		
		
		
		System.out.println(list.indexOf(i));
	
}
				
		}
		
		
		
		
		
		
		
		
		
	}

		
	

	