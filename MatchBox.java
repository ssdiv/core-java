class MatchBox
{
	String brand="quenker matches";
	int noOfStick=30;
	double length;
	int prize=2;
	char size='S';
	double weight;
	String type;
	
	MatchBox()
	{
		System.out.println("Manufatured number of matchbox .....");
	}
	MatchBox(String brand)
	{
		this.brand=brand;
		System.out.println("Brand of MatchBox....."+brand);
	}
	MatchBox(int noOfStick)
	{
		this.noOfStick=noOfStick;
		System.out.println("number of Sticks in MatchBox......"+noOfStick);
	}
	MatchBox(double length)
	{
		this.length=length;
		System.out.println("length of MatchBox......"+length);
	}
	MatchBox(String type,double weight)
	{
		this.type=type;
		this.weight=weight;
		System.out.println("type and weight of matchbox....."+type+","+weight);
	}
	MatchBox(String brand,int prize)
	{
		this.brand=brand;
		this.prize=prize;
		System.out.println("brand and prize of matchbox......"+brand+","+prize);
	}
	MatchBox(int noOfStick,char size)
	{
		this.noOfStick=noOfStick;
		this.size=size;
		System.out.println("brand and prize of matchbox......"+noOfStick+","+size);
	}	
}