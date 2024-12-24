package TestSample;
import java.util.*;
public class test4 {

	public static void main(String[] args) {
		System.out.println("1.ArrayIndexOfBound\n2.NumberFormatException");
		System.out.println("Entre your choice");
	Scanner sc =new Scanner(System.in);
		int choice = sc.nextInt();
	
		System.out.println("Enter the string");
        String str[] =  new String[5];
		switch(choice)
		{
		case 1:   try {
		     	   for(int i=0;i<str.length;i++)
			           {
			        	   str[i]=sc.next();
			           }
			           //int a = Integer.parseInt(str[0]);
		     	   System.out.println("Enter the index");
		     	   int index = sc.nextInt();
			           System.out.println(str[index]);
		        }
		        catch(Exception ex)
		        {
		     	   System.out.println("Error is"+ex);
		        }
		        break;
        
		           
		case 2:
				try { 
			           for(int i=0;i<str.length;i++)
			           {
			        	   str[i]=sc.next();
			           }
			           int a = Integer.parseInt(str[0]);
			           System.out.println(a);
		           }
		           catch(Exception ex)
		           {
		        	   System.out.println("Error is"+ex);
		           }
		           break;
		default:System.out.println("Invalid Choice");
		
		}
			
	}
		
}


