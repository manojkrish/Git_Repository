package thread;

import java.util.Scanner;

public class SynThread extends Thread{

	private boolean running =true;
	
	public void run(){
		
		while(true){
			System.out.println("Is running");
			try{
				Thread.sleep(2);
			}
			catch(Exception e)
			{
				System.out.println("Error is : " +e);
			}
		}
	}
	
	public void shutdown(){
		
		running= false;
		
		System.out.println("Stopped running");
		
	}
	public static void main(String[] args) {
		
		SynThread st = new SynThread();
		
		st.run();
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter the Integer 0 or 1 : ");
		
		s.next();
		
		st.shutdown();		
	}

}
