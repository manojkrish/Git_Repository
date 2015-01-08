package java_tut;

public class parsing 
{
	
	int a;
	
	int b;

	
	public void calc()
	{
		   
		//Parsing integer value into the string values//
		
		String c = String.valueOf(a+b);
		
		System.out.println(c);
			
	}

	public static void main(String[] args) 
	{
	
		parsing p = new parsing();
		
		p.a=3;
		
		p.b=6;
		
		p.calc();
	
	}

}
