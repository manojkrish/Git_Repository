package java_tut;

import java.util.Scanner;

public class Dat {
	
	public static void main(String[] args)	
	{
		Scanner input = new Scanner(System.in);
		
		String name ;
		
		int age ;
		
		double salary ;
		
		System.out.println("Enter the Name of the Employee : " );
		
		name  = input.nextLine();
		
		System.out.println("Enter the Age of the Employee");
		
		age = input.nextInt();
		
		System.out.println("Enter the salary of the Employee");
		
		salary = input.nextDouble();
		
		System.out.printf("%s is employee of our company and has %d who has earning the %5.2f salary",name,age,salary);
		
	}

}
