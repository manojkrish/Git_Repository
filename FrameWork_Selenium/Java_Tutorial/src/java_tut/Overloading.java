package java_tut;

public class Overloading {
	
	void test(){
		
		System.out.println("No param");
	
	}
	
	void test(int a){
		
		System.out.println("a: "+a);
	}
	
	void test(int a, int b){
		
		int Sum = a+b;
		
		System.out.println("Values of A and B are :  "+Sum);
		
	}
	
	void test(int a,int b,String c){
		
		int sum = a+b;
		
		System.out.println("values of the A,B and C are :  " +sum+"  "+c);
	}
	
	public static void main(String[] args){
		
		Overloading OL = new Overloading();
		
		OL.test(1);
		
		OL.test(1,2);
		
		OL.test(1, 2, "Bing");
		
	}

}
