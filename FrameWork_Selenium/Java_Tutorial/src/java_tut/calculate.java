package java_tut;

public class calculate {

	public static void main(String[] args) {
		
		Employee ep = new Employee();
		
		ep.bonus = 2000;
		  
		ep.salary = 8000;
		
		ep.calculate();
		
		Employee ep1 = new  Employee();
		
		ep1.bonus = 5000;
		
		ep1.salary = 9000;
		
		ep1.calculate();
		
		Employee ep2 = new Employee();

		ep2.bonus = 9000;
		
		ep2.salary = 10000;
		
		ep2.calculate();
	}

}
