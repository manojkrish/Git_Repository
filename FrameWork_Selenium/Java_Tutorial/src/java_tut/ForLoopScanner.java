package java_tut;

import java.util.Scanner;

public class ForLoopScanner 
{

	public static void main(String[] args)
	{
		Scanner  val = new Scanner(System.in);
		 
		int i,j;
		
		System.out.println("Enter the value of 'i' : ");
		
		i = val.nextInt();

		System.out.println("Enter the value of 'j' : ");
		
		j=val.nextInt();
		
		for (int k=0;k<=i;k++)
		{
			
			System.out.println("Repeat");
			
			for (int l =0;l<=j;l++)
			
			{
			
				System.out.println("manoj");
			
			}
		
		}
		
		
		
	}

}