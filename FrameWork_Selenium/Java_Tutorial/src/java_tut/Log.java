package java_tut;

import java.util.Scanner;

public class Log {		

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Value of PI :");
		
		double pie = in.nextDouble();
		
		System.out.println("Enter the value of r :");
		
		int r = in.nextInt();
		
		num  n = new num();
		
		/*l.username = user;
	
		l.password = pass;*/
		
		System.out.println("Value passed to the class");
		
		n.calc(r, pie);
		
		System.out.println("Value is get received");
		
		double add = n.calc(r, pie);
		
		System.out.println(add);
		
		
	}

}
