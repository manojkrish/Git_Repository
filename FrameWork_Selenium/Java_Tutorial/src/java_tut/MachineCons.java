////Overloading Concepts



package java_tut;

public class MachineCons {
	
	private int Age;
	
	private String Name;
	
	public MachineCons()
	{
		
		this("Null");
		
		System.out.println("Initial Constructor is Running");
	
	}
	MachineCons(String name)
	{
		
		this("Null",0);
		
		System.out.println("Second Constructor is Running");
	
	}
	MachineCons(String name,int Age)
	{
		
		System.out.println("Third Constructor is Running");
	
	}
	
	public static void main(String[] args)
	{
		MachineCons MC = new MachineCons();
		
		MachineCons MC1 = new MachineCons("Name");
		
		MachineCons MC2 = new MachineCons("Name", 34);
		
	}

}
