class RocketStarter
{
	public static void main(String[] rocketstart)
	{
		System.out.println("Starting of main in rocketstarter");
		
		Rocket rocket=new Rocket();
		System.out.println("location of rocket : "+rocket.location);
		System.out.println("noOfScientist in rocket : "+rocket.noOfScientist);
		System.out.println("speed of rocket : "+rocket.speedInKm);
		System.out.println("weight of rocket : "+rocket.weight);
		
		System.out.println("*************************");
		
		Rocket rocket1=new Rocket("karnataka");
		System.out.println("location of rocket1 : "+rocket1.location);
		System.out.println("noOfScientist in rocket1 : "+rocket1.noOfScientist);
		System.out.println("speed of rocket1 : "+rocket1.speedInKm);
		System.out.println("weight of rocket1 : "+rocket1.weight);
		
		System.out.println("*************************");
		
		Rocket rocket2=new Rocket("tamil Nadu",500);
		System.out.println("location of rocket2 : "+rocket2.location);
		System.out.println("noOfScientist in rocket2 : "+rocket2.noOfScientist);
		System.out.println("speed of rocket2 : "+rocket2.speedInKm);
		System.out.println("weight of rocket2 : "+rocket2.weight);
		
		System.out.println("*************************");
		
		Rocket rocket3=new Rocket("Andra pradesh",560,1000);
		System.out.println("location of rocket3 : "+rocket3.location);
		System.out.println("noOfScientist in rocket3 : "+rocket3.noOfScientist);
		System.out.println("speed of rocket3 : "+rocket3.speedInKm);
		System.out.println("weight of rocket3 : "+rocket3.weight);
		
		System.out.println("*************************");
		
		Rocket rocket4=new Rocket("maharastra",550,990,"lightweight");
		System.out.println("location of rocket4 : "+rocket4.location);
		System.out.println("noOfScientist in rocket4 : "+rocket4.noOfScientist);
		System.out.println("speed of rocket4 : "+rocket4.speedInKm);
		System.out.println("weight of rocket4 : "+rocket4.weight);
		
		System.out.println("*************************");
		
		System.out.println("Ending of main in rocketstarter");
	}
}