package java_tut;

 class Final {
	
	 public static int age;
	 
	 public String name;
	 
	 public static String gender;
	 
	 public void display()
	 {
		  System.out.println(age);
		  
		  System.out.println(name);
		  
		  System.out.println(gender);
	 }
	 
	 public static void display2()
	 {
		 System.out.println(age);
	 }

	 public static void main(String[] args){
		 
		 Final f = new Final();
		 
		 f.name = "Phil";
		 
		 f.gender ="Male";
		 
		 f.age =27;
		 
		 f.display();
		 
		 f.display2();
		 
	 }
}
