package thread;

public class MultiThread extends Thread
{
	
	public void run()
	{
		for (int i=0; i<=5;i++){
			for(int j=0;j<=5;j++){
				System.out.print(i);
				System.out.print(j);
				System.out.println();
			}
		}
	}
	
	public void run1()
	{
		int a[]={1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0;i<a.length;i++){
			
			System.out.print(a[i]);
			
			System.out.println();
		}
	}
	
	public void run2(){
		String a[]={"Mike","Phil","Mark","Ben","George"};
		
		for(int k=0;k<a.length;k++){
			
			System.out.println(a[k]);
		}
	}

	public static void main(String[] args) 
	{
	
		MultiThread MT = new MultiThread();
		
		MT.run();
		
		MT.run1();
		
		MT.run2();

	}

}
