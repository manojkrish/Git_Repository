package java_tut;

public class Str {

	public static void main(String[] args) 
	{
	String info ="  ";
	
	info +="Hi There";
	
	info +=" Hi am Fine";
	
	info+="How About You";
	
	System.out.println(info);
	
	StringBuilder sb = new StringBuilder(" ");
	
	sb.append("Hi How are you ");
	
	sb.append("&");
	
	sb.append("Where are You");
	
	System.out.println(sb.toString());
	
	StringBuilder s = new StringBuilder();
	
	s.append("Hello")
	
	.append("      ")
	
	.append(" My Name is John  ")
	
	.append("       ")
	
	.append("  Who are you   ");
	
	System.out.println(s.toString());
	
	System.out.println("Hi There who was here \t That was a Tab and \n this is the new Line ");
	
	StringBuilder B = new StringBuilder();
	 
	B.append("Hello Who Is This ")
	
	.append("            ")
	
	.append("To Whom I Am Talking With");
	
	System.out.println(B.toString());
	
	String c[] = {"manoj","Phil","Mark","Kim","Anthony","Duke","Bravo","Charle","Alpha","Hitler","Mossolini","Peter","Parker"};
	
	for(int j=0;j<=5;j++)
	{
	for(int i=0 ;i<c.length;i++){
		
		System.out.println("hi there : "+c[i]);
	}
	}
	
	String Name[]={ "Manoj","Phil","Jacob","Mark","Jim"};
	
	String Initial[]={"Kr","P","J","K","O"};
	
	for (int k=0;k<Name.length;k++)
	{
		System.out.println("Name and the initials of the Employee : "+Name[k]+" ." +Initial[k]);
		
	}
	
	}

}
