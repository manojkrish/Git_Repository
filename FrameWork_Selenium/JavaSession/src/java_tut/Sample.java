package java_tut;

public class Sample {

		double salary;
		
		int age;
		
		String name;
		
		void disp(){
			
			System.out.println(+salary+"\t"+age+"\t"+name+"\t");
		}
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		
		s.age =90;
		
		s.name = "Phil";
		
		s.salary=78979798;
		
		s.disp();

	}

}