package TestSample;
import java.util.*;
interface Employee
{
	void performTask();
	void CalculateSalary();
}
class Manager implements Employee
{

	String name;
	double sal;
	int tsize;
	Manager(String name,double sal,int tsize)                 //set the details of manager
	{  
		this.name=name;
		this.sal=sal;
		this.tsize=tsize;
	}
	public void performTask() {
		
		System.out.println("Manager managing a team");                  //print the performs task of manager
	}

	
	public void CalculateSalary() {
	    double finalSal = sal+(tsize*1000);
	    System.out.println("Final salary of manager = "+finalSal);             //calculate the salary of manager
	}
	
}
class Developer implements Employee
{
	String name;
	double sal;
	int ctask;
	Developer(String name,double sal,int ctask)                    //set the details of developer
	{
		this.name=name;
		this.sal=sal;
		this.ctask=ctask;
	}
	public void performTask() {
		
		System.out.println("Developer perform the task is coding");              //print the performs task of manager
	}

	
	public void CalculateSalary() {
		double finalSal = sal+(ctask*200);
	    System.out.println("Final salary of manager = "+finalSal);                      //calculate the salary of manager
		
	}
	
}

public class test5 {

	public static void main(String[] args) {
		
	

		System.out.println("Enter the name , base salary and team size of manager");
		Scanner sc= new Scanner(System.in);
		String name = sc.next();
		double sal = sc.nextDouble();
		int tsize = sc.nextInt();
		Manager m =new Manager(name, sal, tsize);              //pass the details using constructor to manager class
		m.performTask();
		m.CalculateSalary();
		
		
		System.out.println("\n\n\nEnter the name , base salary and calculate Task of Developer");
		 name = sc.next();
		 sal = sc.nextDouble();
		int ctask = sc.nextInt();
		Developer d =new Developer(name, sal, ctask);    //pass the details using constructor to developer class
		d.performTask();                                    
		d.CalculateSalary();
		
	}

}
