package objectclass;

public class Mobile {

	String brand;
	String name;
	double price;
	int ram;
	int rom;
	
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}


	public Mobile(String brand, String name, double price, int ram, int rom) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
	}
	
	public String toString()
	{
		return "[name: "+name+"brand: "+brand+"price :"+price+"ram :"+ram+"rom:"+rom+"]";
	}
	
	public boolean equals(Object ref)
	{
		Mobile m=(Mobile) ref;
		if(brand==m.brand && name==m.name && price==m.price && ram==m.ram && rom==m.rom)
		{
			return true;
		}
		
		return false;
	}
	
	public int hashCode()
	{
		return ram+rom+name.hashCode()+brand.hashCode();
	}
}
