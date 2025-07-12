package objectclass;

public class MobileDriver {

	public static void main(String[] args) {
		
		Mobile m1=new Mobile("Samsung","Pankaj",46580.9,8,128);
		
		System.out.println(m1);
		System.out.println(m1.toString());
		
		Mobile m2=new Mobile("Samsung","Pankaj",46580.9,8,128);
		System.out.println(m1==m2);
		System.out.println(m2.equals(m1));
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}
}
