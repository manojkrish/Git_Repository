package threadingClass;

public class SimpleThread extends Thread {

	int a, b;

	int sum;

	public void run() {
		
		sum = a+b;
		
		System.out.println("The Sum of the values A and B are : " +sum);

	}

	public static void main(String[] args) {

		SimpleThread st = new SimpleThread();
		
		st.a = 89;
		
		st.b = 90;
		
		st.start();
		
	}

}
