package objectclass;

public class Book {

	String name;
	String author;
	int pages;
	double price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}


	public Book(String name, String author, int pages, double price) {
		super();
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.price = price;
	}
	
	public boolean equals(Object o)
	{
		Book b1=(Book) o;
		if(this.name==b1.name && this.author==b1.author && this.pages==b1.pages && this.price==b1.price)
		{
			return true;
		}
		
		return false;
	}
}
