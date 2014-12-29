package session1;

public class Person {
	
	int age;
	
	String name;
	
	static String companyName;
	
	public static void main(String[] args)
	{
		Person p = new Person();
		
		p.age=12;
		
		p.name="Phil";
		
		Person.companyName ="Pearson";
		
		System.out.println(Person.companyName+"     "+p.age+"    "+p.name);
		
	}

}
