package inter;
 
public class Repeat {

	public static void main(String[] args)
	{
	try{
		
		int a[ ] = new int [2];
		
		System.out.println(a[4]);
		
	}
	catch (Exception Ex)
	{
		System.out.println(Ex);
	}
		
		try{
		
		int a1 = 0;
		
		int b = 9;
		
		int c =b/a1;
		
		System.out.println(c);
		}
		catch(Exception Ex)
		{
			System.out.println(Ex);
		}
	
}
}