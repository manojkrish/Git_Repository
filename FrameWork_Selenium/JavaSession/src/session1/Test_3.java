package session1;

public class Test_3 {
	
 double height;
 
 double width;
 
 double a;
 
 public double area_of_square(){
	 
	 return (a*a);
 }
 
 public double area_of_rectangle(){
	 return (height*width);
 }

	public static void main(String[] args) {
		
		Test_3 t3 = new Test_3();
		
		t3.a = 2;
		
		t3.height =13;
		
		t3.width =56;
		
		System.out.println("Area of the rectangle is : " +t3.area_of_rectangle());
		
		System.out.println("Area of the square is : " +t3.area_of_square());
		
	}

}
