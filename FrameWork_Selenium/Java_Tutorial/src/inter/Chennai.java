package inter;

public class Chennai extends Coimbatore implements A,B{
	
	String Location="Ayanavaram";
	
	String Zipcode="600023";
	
	public void display()
	{
		System.out.println("Location and the Zipcode for the Chennai area is       "+Location+ "           "+Zipcode);
	}

	public void Erode() {
		
		String Location = "PampanackenPalayam";
		
		String Zipcode = "123456";
		
		System.out.println("Location and the Zipcode for the Erode area is       "+Location+ "           "+Zipcode);
		
	}

	public void MaduraiCode() {

		String Location ="Melamasi Veethi";
		
		String Zipcode = "567895";
		
		System.out.println("Location and the Zipcode for the Madurai area is       "+Location+ "           "+Zipcode);
	}
	

}
