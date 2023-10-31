class ShowRoom
{
	int noOfWorkers=102;
	String industrial="wareshouse";//wareshouse,factories
	String loaction;
	double investment;
	String retail="retail stores";//retail stores,shoppingcenters,shops
	String healthCare;//medicalcenters,hospitals,nursing homes
	String color;
	float diameterInSquareFeet;
	
	ShowRoom()
	{
		System.out.println("ShowRoom features......");
	}
	ShowRoom(int noOfWorkers)
	{
		this.noOfWorkers=noOfWorkers;
		System.out.println("number of workers in showroom......."+noOfWorkers);
	}
	ShowRoom(String industrial)
	{
		this.industrial=industrial;
		System.out.println("Industrial ShowRoom......."+industrial);
	}
	ShowRoom(double investment)
	{
		this.investment=investment;
		System.out.println("investment ShowRoom......."+investment);
	}
	ShowRoom(float diameterInSquareFeet)
	{
		this.diameterInSquareFeet=diameterInSquareFeet;
		System.out.println("diameterInSquareFeet of ShowRoom......."+diameterInSquareFeet);
	}
	ShowRoom(String healthCare,String retail)
	{
		this.healthCare=healthCare;
		this.retail=retail;
		System.out.println("healthCare and retail of showroom......."+healthCare+","+retail);
	}
	ShowRoom(String color,double investment)
	{
		this.noOfWorkers=noOfWorkers;
		this.investment=investment;
		System.out.println("color and investments of showroom......."+color+","+investment);
	}
	ShowRoom(String loaction,int noOfWorkers)
	{
		this.loaction=loaction;
		this.color=color;
		System.out.println("loaction and color of showroom......."+loaction+","+noOfWorkers);
	}
}