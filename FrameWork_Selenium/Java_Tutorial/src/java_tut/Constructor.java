package java_tut;

public class Constructor {
	
	String login_link;
	String login_input;
	String login_password;
	String loginButton;
	
	
	Constructor(){
		
		login_link = "facebook";
		login_input ="manoj";
		login_password ="1234";
		loginButton ="click";
	}
	
	public void login(){
		
		System.out.println(login_link);
		System.out.println(login_input);
		System.out.println(login_password);
		System.out.println(loginButton);
	}
	

	public static void main(String[] args)
	{
		Constructor c = new Constructor();
		
		c.login();
	}

}
