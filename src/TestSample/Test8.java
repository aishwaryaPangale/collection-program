package TestSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		ListIterator<Integer> li = al.listIterator();

		System.out.println("Enter the value for forward direction modify");
		int fvalue = sc.nextInt();
		int value = 0;
		while(li.hasNext())
		{
			 value = li.next();
			 System.out.print(value);
			 if(value==fvalue)
			 {
				 li.set(100);
				 System.out.print(" (Modified Value)\n");
			 }
             else
             {
            	 System.out.println();
             }
		
		}
		System.out.println("\nAfter Modify forward Direction \n ");
		System.out.println(al);
		
		System.out.println("\n\n----------------------------------------------------------\n\n");
		System.out.println("Enter the value for Backward direction modify");
		int bvalue = sc.nextInt();
		 value=0;
		while(li.hasPrevious())
		{
			 value = li.previous();
			 System.out.print(value);
			 if(value==bvalue)
			 {
				 li.set(200);
				 System.out.print(" (Modified Value)\n");
			 }
			 else
             {
            	 System.out.println();
             }
			 
		}
		System.out.println("\nAfter Modify forward Direction \n ");
		System.out.println(al);
		
	}

}

