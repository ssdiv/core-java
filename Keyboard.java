class Keyboard
{
	String brand;
	String color="Black";
	int noOfKeys;
	String type="wired";
	double cost;
	
	Keyboard()
	{
		System.out.println("Keyboard running successfully");
	}
	Keyboard(String brand)
	{
		this.brand=brand;
		System.out.println("brand of keyboard....."+brand);
	}
	Keyboard(int noOfKeys)
	{
		this.noOfKeys=noOfKeys;
		System.out.println("noOfKeys in keyboard....."+noOfKeys);
	}
	Keyboard(double cost)
	{
		this.cost=cost;
		System.out.println("cost of keyboard....."+cost);
	}
	Keyboard(String brand,int noOfKeys)
	{
		this.brand=brand;
		this.noOfKeys=noOfKeys;
		System.out.println("brand and noOfKeys of keyboard...."+brand+","+noOfKeys);
	}
	Keyboard(String type,double cost)
	{
		this.type=type;
		this.cost=cost;
		System.out.println("type and cost of keyboard....."+type+","+cost);
	}
}