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
	
	}

}
