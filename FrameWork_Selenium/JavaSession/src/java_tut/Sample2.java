package java_tut;

public class Sample2 {
	
	double p;
	
	double r;
	
	double t;
	
	double SimpleCalc()
	{
		
		return (p*r*t/100);
		
	
	}
	
	public static void main(String[] args)
	{
		
		Sample2 s2 = new Sample2();
		
		s2.p=1000;
		
		s2.r=10.5;
		
		s2.t=3;
		
		System.out.println(s2.SimpleCalc());		
		
	}

}
