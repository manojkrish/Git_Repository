package array;

public class EnhancedForloop 
{

	public static void main(String[] args) 
	{
		
		int a[]={12,13,14,15,16,17};
		
		int total=0;
		
		//Enhanced For loop 
		for(int x:a)
		
		{
			
			total+=x; 
			
		}

		System.out.println(total);
	}

}
