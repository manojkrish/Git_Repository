package java_tut;

public class Method {
	
	void MarkCal(int sub ,int mat)
	{
		
		int add = sub + mat;
		
		System.out.println(add);
	
	}
	
	void status(String st ,String gt)
	{
		System.out.println(st);
		
		System.out.println(gt);
	}
	
	void Namest(String name,int Id)
	{
		System.out.println(name);
		
		System.out.println(Id);
	}
	
	public static void main(String[] args)
	{
		Method MD = new Method();
		
		MD.MarkCal(34, 45);
		
		MD.Namest("John", 12);
		
		MD.status("Pass", "good");
	}
}
