package java_tut;

public class Passing_Returning 
{
		
			String name ;
			
			String area;
			
			String location(String name,String area)
			{
				
				int zipcode = 1234;
				
				String locality = name + area+zipcode;
				
				return locality;
				
				}
			}