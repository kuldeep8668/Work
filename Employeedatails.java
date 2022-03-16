package Demo2;
import java.util.Scanner;


public class Employeedatails {
	String name;
	int age;
	int salary;
	void add()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		name=s.next();
		System.out.println("enter the age");
		age=s.nextInt();
		System.out.println("enter the salary");
		salary=s.nextInt();
		
	}
	
	void display()
	{
		System.out.println("Employee name"+name);
		
		System.out.println("age"+age);
		System.out.println("Salary"+salary);
		
	}
	
	

	public static void main(String[] args) {
		Employeedatails d=new Employeedatails();
		d.add();
		d.display();
	}
		
		
		
	
		
		
	}

