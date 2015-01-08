package thread;

public class ThreadClass extends Thread
{

	public void run()
	{
		for(int i=0;i<=9;i++)
		{
			System.out.println("Thread count : " +i);
		}
		
	}
	
	public static void main(String[] args){
		
		ThreadClass TC = new ThreadClass();
		
		ThreadClass TC1 = new ThreadClass();
		
		TC.start();
		
		TC1.start();
		
		System.out.println(TC.isAlive());
	}

}
