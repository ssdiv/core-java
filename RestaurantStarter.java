class RestaurantStarter{
	
	public static void main(String args[])
	{
		System.out.println("Starting of the main method");
		
		Restaurant restaurant=new Restaurant();
		
		String[] specialitems=new String[6];    // creation of the arrays
		specialitems[0]="Besibelebath";
		specialitems[1]="puri";
		specialitems[2]="idli";
		specialitems[3]="rooti";
		specialitems[4]="dall";
		specialitems[5]="paysa";
		restaurant.setSpecialitems(specialitems);
		restaurant.setOwnerName("Akash");
		restaurant.display();
		
		
		System.out.println("Starting of the main method");
		
}
}