package java_tut;

public class ConstPara {
	
	String loginlink;
	String loginInput;
	String PasswordInput;
	String loginButton;
	

	ConstPara(String a,String b,String c,String d){
		
		loginlink=a;
		loginInput=b;
		PasswordInput=c;
		loginButton=d;
	}
	
	public void Result()
	{
		System.out.println(loginlink);
		
		System.out.println(loginInput);
		
		System.out.println(PasswordInput);
		
		System.out.println(loginButton);
		
	}
	
	public static void main(String[] args)
	{
		ConstPara CP = new ConstPara("Facebook","Manoj","******","Click");
		
		CP.Result();
	}

}
