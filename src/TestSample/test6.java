package TestSample;

import java.io.*;
import java.util.Scanner;
public class test6 {

	public static void main(String[] args) throws IOException {
          
		Scanner sc =new Scanner(System.in);
		File f = new File("D:\\Demo\\TestSample.txt");
	    FileWriter fw = new FileWriter("D:\\Demo\\TestSample.txt",true);
	    BufferedWriter bw =new BufferedWriter(fw);
	    System.out.println("Enter the data");
	    String data = sc.nextLine();
	    bw.write(data);
	    bw.newLine();
	    System.out.println("Data Write Successfully");
	    
	    bw.close();
	    fw.close();
	
	    int count=0;
	    FileReader fr = new FileReader("D:\\Demo\\TestSample.txt");
	    BufferedReader br =new BufferedReader(fr);
	     String rdata ;
	     System.out.println("\n\n\nEnter the word you search");
	     String word = sc.next();
	     while((data=br.readLine())!=null)
	     {
	    	 System.out.println(data);
	    	 String str[] = data.split(" ");
	    	 for(int i=0;i<str.length;i++)
	    	 {
	    		 if(str[i].equalsIgnoreCase(word))
		    	 {
		    		 count++;
		    	 }
	    	 }
	     }
	     System.out.println("\n\n\nCounting Word");
	     System.out.println(word+"----------"+count);
	    
	    
	     br.close();
	     fr.close();
	     
	     

	}

}
