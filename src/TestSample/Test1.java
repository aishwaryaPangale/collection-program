package TestSample;

import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();                    //give the string to user
		
		System.out.println("\n\nDisplay String : "+str);
		
		String str1[] = str.split(" ");    //this method use for remove the Space means spit string to space
		System.out.print("[");
		 for(int i=0;i<str1.length;i++)
		 {
			 String temp=str1[i];           
			 char ch[] = temp.toCharArray();                      //convert string to character array
			 for(int j=0,k=ch.length-1;j<ch.length/2;j++,k--)         //logic for reverse the string
			 {
				 char c = ch[j];
				 ch[j]=ch[k];
				 ch[k]=c;
			 }
			String reversString = String.valueOf(ch);        //convert character array to string
			
			 if(temp.equalsIgnoreCase(reversString)&& reversString.length()>=2)            //check reverse string or main string equal or not
			 {  
				 System.out.print("'"+reversString+"'"+" , ");
			 }
			
		 }
		 System.out.print("]");
		

	}

}
