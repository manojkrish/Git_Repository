package java_tut;

import java.util.Scanner;

class Para{
	
	void details(String n,String g,String st)
	{
		
		String name = n;
		
		String gender = g;
		
		String status = st;
		
		if(name == n)
		{
		System.out.println("Correct data");	
		
		if(gender == g)
		{
			System.out.println("Gender is Male");
			
			if(status == st )
			{
				System.out.println("Login is Successful");
			}
			else
			{
				System.out.println("Login not Successful");
			}
		}
		else
		{
			System.out.println("Gender is Wrong");
		}
		}
		else
		{
		System.out.println("Wrong Data");	
		}
	}	
	
	public static void main(String[] args)
	{
		Para p = new Para();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter The Name : ");
		
		String n = s.next();
		
		System.out.println("Enter The Gender :");
		
		String g = s.next();
		
		System.out.println("Enter the Status :");
		
		String st = s.next();
		
		p.details(n,g,st);
		
		}
	}