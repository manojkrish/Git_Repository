package java_tut;///class java


class Tutorial_java {
	
	
	double price;
	int number_of_pages;
	String book_name;
	String author_name;
	double weight_of_the_book;
	

	public void display()
	{
		System.out.println(author_name);
		System.out.println(book_name);
		System.out.println(weight_of_the_book);
		System.out.println(number_of_pages);
		System.out.println(price);
	}

	public static void main(String[] args)
	{
		
		Tutorial_java TJ = new Tutorial_java();
		
		TJ.author_name ="mike";
		TJ.book_name = "Java";
		TJ.number_of_pages=1024;
		TJ.price = 175.90;
		TJ.weight_of_the_book=125;
		TJ.display();
	
	}
}
