class MainStarter
{
	public static void main(String[] args)
	{
		
		System.out.println("Starting in Main");
		System.out.println("=====================");
	    System.out.println("*******Tv*******");
		
		Speaker speaker=new Speaker(250);
		
		Tv tv=new Tv(speaker);
		tv.showInfo();
		
		System.out.println("*********Hotel*********");	
		
		MenuCard menu=new MenuCard();
		menu.setMenuCard(20,200.0);
		
		Hotel hotel=new Hotel();
		hotel.setMethod1(menu);
		
		hotel.showInfo();
		
		System.out.println("********Company*********");

		Job job=new Job();
		Company company=new Company(job);
		company.showInfo();
		
		System.out.println("********Clinic********");
		
		Doctor doctor;
		doctor=new Doctor();
		
		Clinic clinic;
		clinic=new Clinic(doctor);
		
		clinic.displayInfo();
		System.out.println("=====================");
		System.out.println("Ending in Main");
		
	}
}