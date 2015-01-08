package construct;

public class NewCons {
	
	private String login;
	
	private String login_button;
	
	private String user_name;
	
	private String passWord;
	
	public void display()
	{
			System.out.println("User name is : "+user_name);
			
			System.out.println("Password is : "+passWord);
			
			System.out.println("Please click on the Login_Button" +login_button);
			
			System.out.println("Login status is shown " +login);
		
	}
	public NewCons(String login,String login_button,String user_name,String passWord)
	{
		
		this.login = login;
		
		this.login_button =login_button;
		
		this.user_name = user_name;
		
		this.passWord = passWord;
		
	}

}
