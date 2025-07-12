package objectclass;

public class BookDriver{

	public static void main(String[] args) {
		
		Object b1= new Book("My Life","Pankaj gaikwad",484,450);
		System.out.println(b1);
		Object b2=new Book();
		System.out.println(b1.toString());
		System.out.println(b1.equals(b2));		
	}
}
