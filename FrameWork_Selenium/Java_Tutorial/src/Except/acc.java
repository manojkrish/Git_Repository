package Except;
import javax.swing.JOptionPane;

class acc{
	public static void main(String[] args){
		try{
		String fn = JOptionPane.showInputDialog("Enter the first number ") ;
		
		String sn = JOptionPane.showInputDialog("Enter the second number ") ;
		
		int  num1 = Integer.parseInt(fn);
		
		int  num2 = Integer.parseInt(sn);
		
		int sum = num1+num2;
		
		JOptionPane.showMessageDialog(null, " The answer is " +sum,"the title is ",JOptionPane.PLAIN_MESSAGE );
		}
		catch(Exception e)
		{
			String man ="Please enter Integer alone in the Number field Box";
			
			JOptionPane.showMessageDialog(null, man,"the title is ",JOptionPane.PLAIN_MESSAGE );
		}
	}
}
