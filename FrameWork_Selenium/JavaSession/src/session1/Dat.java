package session1;

public class Dat {
	
	int a;
	byte b;
	char c;
	float d;
	double e;
	long  f;
	String g;
	boolean h;
	
	public void Ins()
	{
		a =1234567890;
		
		b = 127;
		
		c = 'A';
		
		d = 1234567.00f;
		
		e = 12351342.00;
		
		f = 879789098;
		
		g = "Hi There";
		
		h = true;		
		
		System.out.println("The value of A,B,C,D,E,F,G & H are : "+a+"------"+b+"------"+c+"------"+d+"------"+e+"------"+f+"------"+g+"------"+h);
	
	}

	public static void main(String[] args)
	{
		
		Dat d = new Dat();
		
		d.Ins();
		
	}
}
