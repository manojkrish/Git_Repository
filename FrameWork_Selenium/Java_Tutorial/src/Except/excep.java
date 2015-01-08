package Except;

import java.util.Scanner;

public class excep {
	
	public static void main(String[] args)
	{
		
		try
		
		{
			
			int a = 8;
			
			int b =0;
			
			int c=a/b;
			
			System.out.println(c);
			
		}
		
		catch(Exception ex)
		
		{
			
			System.out.println("Divisble Error");
		
		}
		
		try{
			
			int a[] = new int[6];
			
			System.out.println(a[7]);
			
		}
		
		catch(Exception e){
			
			System.out.println("Array Exceed Issue");
		}
		
		try{
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the String :  ");
			
			int input = s.nextInt();
			
			System.out.println(input);
			
		}
		catch(Exception e){
			
			System.out.println("Please enter the integer Value");
		}
		
		try{
			
			Scanner s1 = new Scanner(System.in);
			
			System.out.println("Enter the value of the Double ");
			
			float count = s1.nextFloat();
			
			System.out.println(count);
		}
		catch(Exception e){
			
			System.out.println("No special symbols and characters");
		}
	}

}
