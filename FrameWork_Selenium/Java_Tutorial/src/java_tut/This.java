///Encapsulation program


package java_tut;

class This{
	
	private int Age;
	
	private String Name;
	
	void  getAge(int Age)
	{
		this. Age = Age;
		 
		 System.out.println(Age);
	}
	
	void getName(String Name)
	{
		this.Name = Name;
		
		System.out.println(Name);
	}
	
	public void allData()
	{
		getAge(Age);
		
		getName(Name);
		
	}
	
	public static void main(String[] args)
	{
		
		This t = new This();
		
		This t2 = new This();
		
		t.getAge(30);
		
		t.getName("Mike");
				
		t2.getAge(29);
		
		t2.getName("Phil");
		
		t.allData();
		
		t2.allData();
	}
}