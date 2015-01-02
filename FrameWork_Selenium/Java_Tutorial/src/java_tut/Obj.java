//// Object class and String

package java_tut;


public class Obj 
{

	private String name;
	
	private int id;
	

	Obj( String name, int id)
	{
		this.name = name;
		
		this.id = id;
		
	}
	
	public String toString()
	{
		return name+"  :    "+id;
	}
	
	
	public static void main(String[] args) 
	{
		
		Obj frog = new Obj("Manoj",17);
		
		Obj frog1 = new Obj("Mike",18);
		
		System.out.println(frog+"     "+frog1);
		
		
	}

}
