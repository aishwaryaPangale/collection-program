package TestSample;

import java.util.ArrayList;
import java.util.*;
public class test3 {

	public static void main(String[] args) {
		
		ArrayList al =new ArrayList();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String str1[] = str.split(" ");
		for(String obj : str1)
		{
			al.add(obj);
		}
		
		Collections.sort(al);
		System.out.println(al);
	
	}

}
