package java_tut;
import java.util.Scanner;
public class strt {
	
	public double add( double fnum,double snum)
	{	
		double	tnum = fnum + snum;
		
		return tnum;
	}
	
	public double sub(double fnum,double snum)
	{
		double tnum = fnum -snum;
		
		return tnum;
	}
	
	public double Mult(double fnum,double snum)
	{
		double tnum = fnum *snum;
		
		return tnum;
	}
	
	public double div(double fnum,double snum)
	{
		double tnum = fnum /snum;
		
		return tnum;
	}
	
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		
		double fnum,snum,tnum;
		
		System.out.println("Enter the First Number : ");
		
		fnum = s.nextDouble();
		
		System.out.println("Enter the Second Number :  ");
		
		snum = s.nextDouble();
		
		strt st = new strt();
		
		st.add(fnum, snum);
		
		System.out.println(st.add(fnum, snum));
		
		st.sub(fnum, snum);
		
		System.out.println(st.sub(fnum, snum));
		
		st.Mult(fnum, snum);
		
		System.out.println(st.Mult(fnum, snum));
		
		st.div(fnum, snum);
		
		System.out.println(st.div(fnum, snum));
	}
	
	

}
