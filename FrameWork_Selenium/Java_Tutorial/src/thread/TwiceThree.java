package thread;

public class TwiceThree extends Thread
{
		 
		public void run()
		
		{
		
			System.out.println("running...");
		 
		}
		 public static void main(String args[])
		 {
		 
			 TwiceThree t1=new TwiceThree();
		  
			 t1.start();
		  
			// t1.start();
		 }
}
