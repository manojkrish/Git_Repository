package thread;

public class FirstThreadRunnable implements Runnable {
	public void run() {

		System.out.println("Thread 1 is running...");

	}

	public static void main(String args[]) {

		FirstThreadRunnable m1 = new FirstThreadRunnable();
		Thread t1 = new Thread(m1);

		t1.start();

	}
}
