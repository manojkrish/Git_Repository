package java_tut;

public class ClassTut {
	
	String loginText;
	String PassWordText;
	String LoginButton;
	String Result;

	public void login1()
	{
		System.out.println(loginText);
		System.out.println(LoginButton);
		System.out.println(PassWordText);
		System.out.println(Result);
		
	}
	
	public void login2()
	{
		System.out.println(loginText);
		System.out.println(LoginButton);
		System.out.println(PassWordText);
		System.out.println(Result);
		
		
	}


public static void main(String[] args){
	
	try{
	
	ClassTut CT = new ClassTut();
	ClassTut CT1 = new ClassTut();
	
	
	CT.loginText ="Manoj";
	CT.PassWordText ="12345";
	CT.LoginButton = "CLICK";
	CT.Result="Success";
	
	
	CT1.loginText ="Manoj";
	CT1.PassWordText ="abcde";
	CT1.LoginButton = "CLICK";
	CT1.Result="Failure";
	
	
	
	CT.login1();
	CT.login2();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	}

}