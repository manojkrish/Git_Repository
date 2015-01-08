package construct;

import java.util.Scanner;


public class InsCons {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Please Enter the UserName in the Field : ");
		
		String us = S.next();
		
		System.out.println("Please Enter the Password in the Field : ");
		
		String pas = S.next();
		
		System.out.println("Please Click on the Login_Button  ");
		
		String lo_bu = S.next();
		
		System.out.println("Login status ");
		
		String lo = S.next();
		
		NewCons NC = new NewCons(lo,lo_bu,pas,us);

		NC.display();
	}

}
