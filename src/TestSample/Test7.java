package TestSample;

import java.util.Scanner;

class Employee1
{
	private int id;
	private String name;
	private String designation;
	private double sal;
	Employee1(int id , String name , String designation,double sal)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.sal=sal;
	}
	public void DisplayMethod(String rating)
	{
		System.out.println(id+"\t"+name+"\t"+sal);
		if("Excellent".equals(rating)||"excellent".equals(rating))
		{
			double Salary = sal*20/100;
			System.out.println("If Rating "+rating+ "then 20% Bouns so total salary is  : "+Salary);
		}
		else if("Good".equals(rating)||"good".equals(rating))
		{
			double Salary = sal*10/100;
			System.out.println("If Rating "+rating+ "then 20% Bouns so total salary is  : "+Salary);
		}
		else if("Average".equals(rating)||"average".equals(rating))
		{
			double Salary = sal*5/100;
			System.out.println("If Rating "+rating+ "then 20% Bouns so total salary is  : "+Salary);
		}
		else
		{
			System.out.println("Not Apply a Bouns ");
		}
		
	}
}

public class Test7 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID , Name , Designation and Salary");
        int id = sc.nextInt();
        String name = sc.next();
        String designation = sc.next();
        double sal = sc.nextDouble();
        
        System.out.println(" \n\n\nEnter the Rating");
        String rating = sc.next(); 
        
        
        Employee1 emp = new Employee1(id,name,designation,sal);   
        emp.DisplayMethod(rating);

	}

}
