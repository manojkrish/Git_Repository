package construct;

public class Cons {
	
	private String name;
	
	private int age;
	
	private String gender;
	
	public Cons(String name,int age,String gender){
		
		this.name = name;
		
		this.age =age;
		
		this.gender = gender;
		
		System.out.println(name+"------------------------------"+age+"------------------------------"+gender);
		
	}

	public static void main(String[] args) {
		
		
		Cons c = new Cons("Manoj",29,"Male");
		
		
		
		
		
		

	}

}
