package java_tut;

import java.util.Scanner;

public class DataAccept {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		String name;
		
		int age;
		
		double salary;
		
		boolean IsMale;
		
		System.out.println("Enter the Name of the Employee : ");
		
		name = Input.nextLine();
		
		System.out.println("Enter the Age of the Employee : ");
		
		age = Input.nextInt();
		
		System.out.println("Enter the Salary of the Employee : ");
		
		salary = Input.nextDouble();
		
		System.out.println("Enter the Employee is Female or Male : ");
		
		IsMale = Input.hasNextBoolean();
		
		String gender = IsMale ? "He" : "She";
		
		System.out.printf("Name of the Employee %s and is age is %d salary of the employee is %5.2f and %s is a good employee",name,age,salary,gender);
	}

}
