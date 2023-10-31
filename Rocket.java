class Rocket
{
	String location;
	int noOfScientist;
	double speedInKm;
	String weight;
	
	Rocket()
	{
		
	}
	Rocket(String location)
	{
		this.location=location;
		System.out.println("location of rocket....."+location);
	}
	Rocket(String location,int noOfScientist)
	{
		this.location=location;
		this.noOfScientist=noOfScientist;
		System.out.println("location and noOfScientist in rocket....."+location+","+noOfScientist);
	}
	Rocket(String location,int noOfScientist,double speedInKm)
	{
		this.location=location;
		this.noOfScientist=noOfScientist;
		this.speedInKm=speedInKm;
		System.out.println("location,noOfScientist and speed in rocket....."+location+","+noOfScientist+","+speedInKm);
	}
	Rocket(String location,int noOfScientist,double speedInKm,String weight)
	{
		this.location=location;
		this.noOfScientist=noOfScientist;
		this.speedInKm=speedInKm;
		this.weight=weight;
		System.out.println("location,noOfScientist,speed and weight in rocket....."+location+","+noOfScientist+","+speedInKm+","+weight);
		
	}
}