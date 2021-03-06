	package thread;

	public class ThreadThroughRunnable implements Runnable
	{
		public void run() 
			{
				for(int j=0;j<=9;j++)
					{
						System.out.println("Thread count is : " +j);
					}
					try 
					{
						Thread.sleep(500);
					}
					catch (InterruptedException e) 
					{
							e.printStackTrace();
					}
			}
		public static void main(String[] args)
		{
			Thread t1 = new Thread(new ThreadThroughRunnable());
	
			Thread t2 = new Thread(new ThreadThroughRunnable());
	
			t1.start();
	
			t2.start();
		}
	}