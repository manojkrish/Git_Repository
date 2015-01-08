package thread;

public class Threeeeeeed extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Count the thread : " + i);
			try{
				Thread.sleep(300);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		Threeeeeeed thr = new Threeeeeeed();
		Threeeeeeed thr1 = new Threeeeeeed();
		Threeeeeeed thr2 = new Threeeeeeed();
		Threeeeeeed thr3 = new Threeeeeeed();
		thr.start();
		thr1.start();
		thr2.start();
		thr3.start();
	}
}
