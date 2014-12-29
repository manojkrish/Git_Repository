package java_tut;

public class Stat {

	public static int a;
	
	public int b;
	
	public static final int c=7;
	
	public static int count =0;
	
	Stat()
	{
		
		int id = count;
		
		System.out.println("Count is :" +id);
		
		count++;
		
	}
	
	Stat(int A,int B)
	{
		a=A;
		
		b=B;		
		
		System.out.println("Non-static values are displayed as :"+a+"   "+b);

	}
	
	Stat(int A)
	{
		a=A;
		
		System.out.println("Static values alone is displayed as " +a);	
		
	}
	
	Stat(String S)
	{
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		
		Stat st = new Stat('A');

		Stat st1 = new Stat(4,5);
		
		Stat st2 = new Stat(7);
	}

}
