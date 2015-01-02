package java_tut;

public class App {

	public static void main(String[] args) {
		
		Machine m = new Machine();
		
		Car c = new Car();
		
		m.start();
		
		c.carIndication();
		
		m.stop();

		c.start();
		
		c.carIndication();
		
		c.stop();
		
	}

}
