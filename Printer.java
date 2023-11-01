class Printer
{
	String company;
	int noOfCopies;
	String color;//monochrome,color
	String sides;//oneside,duplex,tumble
	String quality;//draft,normal,high
	
	Printer()
	{
		this("samsung",5,"blackwhite","oneside","normal");
		System.out.println("Invoking Printer of no-arg const");
	}
	Printer(String company)
	{
		this.company=company;
		System.out.println("Company of printer....."+company);
	}
	Printer(String company,int noOfCopies)
	{
		this.company=company;
		this.noOfCopies=noOfCopies;
		System.out.println("Company,noOfCopies of printer....."+company+","+noOfCopies);
	}
	Printer(String company,int noOfCopies,String color)
	{
		this(company,noOfCopies);
		this.color=color;
		System.out.println("Company,noOfCopies of printer....."+company+","+noOfCopies+","+color);
	}
	Printer(String company,int noOfCopies,String color,String sides)
	{
		this(company,noOfCopies,color);
		this.sides=sides;
		System.out.println("Company,noOfCopies of printer....."+company+","+noOfCopies+","+color+","+sides);
	}
	Printer(String company,int noOfCopies,String color,String sides,String quality)
	{
		this(company,noOfCopies,color,sides);
		this.quality=quality;
		System.out.println("Company,noOfCopies of printer....."+company+","+noOfCopies+","+color+","+sides+","+quality);
    }
}