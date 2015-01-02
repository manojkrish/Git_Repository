package accessModifier;

class A{  
	
protected void msg(){
	
	System.out.println("Hello java");

}  

}  
  
public class SampleAccess extends A{  

	protected void msg(){
		
		System.out.println("Hello java1");
		
	}
	//C.T.Error  
 public static void main(String args[]){  
   
	 SampleAccess obj=new SampleAccess();  
   
	 obj.msg();  
   
 }  
}  