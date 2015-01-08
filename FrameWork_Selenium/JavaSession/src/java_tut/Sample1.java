package java_tut;

public class Sample1 {
	
	public static int age;
	
	public static String name;
	
	public static double salary;
	
	public static void display()
	{
		
		System.out.println(+salary+"\t"+age+"\t"+name+"\t");
		
	}

	public static void main(String[] args) {
		
		Sample1.age =89;
		
		Sample1.name="Duke";
		
		Sample1.salary = 5775675;
		
		Sample1.display();

		
	}

}
