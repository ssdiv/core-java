class ShowRoomStarter
{
	public static void main(String[] shoeroom)
	{
		System.out.println("Starting of main in ShowRoomStarter");
		
		ShowRoom showRoom=new ShowRoom();
		System.out.println("ShowRoom workers :"+showRoom.noOfWorkers);
		System.out.println("ShowRoom industrial :"+showRoom.industrial);
		System.out.println("ShowRoom loaction :"+showRoom.loaction);
		System.out.println("ShowRoom investment :"+showRoom.investment);
		System.out.println("ShowRoom retail :"+showRoom.retail);
		System.out.println("ShowRoom healthCare :"+showRoom.healthCare);
		System.out.println("ShowRoom color :"+showRoom.color);
		System.out.println("ShowRoom diameterInSquareFeet :"+showRoom.diameterInSquareFeet);
		
		System.out.println("*************************");
		
		ShowRoom showRoom1=new ShowRoom(200);
		System.out.println("ShowRoom1 workers :"+showRoom1.noOfWorkers);
		System.out.println("ShowRoom1 industrial :"+showRoom1.industrial);
		System.out.println("ShowRoom1 loaction :"+showRoom1.loaction);
		System.out.println("ShowRoom1 investment :"+showRoom1.investment);
		System.out.println("ShowRoom1 retail :"+showRoom1.retail);
		System.out.println("ShowRoom1 healthCare :"+showRoom1.healthCare);
		System.out.println("ShowRoom1 color :"+showRoom1.color);
		System.out.println("ShowRoom1 diameterInSquareFeet :"+showRoom1.diameterInSquareFeet);
		
		System.out.println("*************************");
		
		ShowRoom showRoom2=new ShowRoom("factories");
		System.out.println("ShowRoom2 workers :"+showRoom2.noOfWorkers);
		System.out.println("ShowRoom2 industrial :"+showRoom2.industrial);
		System.out.println("ShowRoom2 loaction :"+showRoom2.loaction);
		System.out.println("ShowRoom2 investment :"+showRoom2.investment);
		System.out.println("ShowRoom2 retail :"+showRoom2.retail);
		System.out.println("ShowRoom2 healthCare :"+showRoom2.healthCare);
		System.out.println("ShowRoom2 color :"+showRoom2.color);
		System.out.println("ShowRoom2 diameterInSquareFeet :"+showRoom2.diameterInSquareFeet);
		
		System.out.println("*************************");
		
		ShowRoom showRoom3=new ShowRoom(50000.0D);
		System.out.println("ShowRoom3 workers :"+showRoom3.noOfWorkers);
		System.out.println("ShowRoom3 industrial :"+showRoom3.industrial);
		System.out.println("ShowRoom3 loaction :"+showRoom3.loaction);
		System.out.println("ShowRoom3 investment :"+showRoom3.investment);
		System.out.println("ShowRoom3 retail :"+showRoom3.retail);
		System.out.println("ShowRoom3 healthCare :"+showRoom3.healthCare);
		System.out.println("ShowRoom3 color :"+showRoom3.color);
		System.out.println("ShowRoom3 diameterInSquareFeet :"+showRoom3.diameterInSquareFeet);
		
		System.out.println("*************************");
		
		ShowRoom showRoom4=new ShowRoom(15000.0f);
		System.out.println("ShowRoom4 workers :"+showRoom4.noOfWorkers);
		System.out.println("ShowRoom4 industrial :"+showRoom4.industrial);
		System.out.println("ShowRoom4 loaction :"+showRoom4.loaction);
		System.out.println("ShowRoom4 investment :"+showRoom4.investment);
		System.out.println("ShowRoom4 retail :"+showRoom4.retail);
		System.out.println("ShowRoom4 healthCare :"+showRoom4.healthCare);
		System.out.println("ShowRoom4 color :"+showRoom4.color);
		System.out.println("ShowRoom4 diameterInSquareFeet :"+showRoom4.diameterInSquareFeet);
		
		System.out.println("*************************");
		
		ShowRoom showRoom5=new ShowRoom("medicalcenters","shoppingcenters");
		System.out.println("ShowRoom5 workers :"+showRoom5.noOfWorkers);
		System.out.println("ShowRoom5 industrial :"+showRoom5.industrial);
		System.out.println("ShowRoom5 loaction :"+showRoom5.loaction);
		System.out.println("ShowRoom5 investment :"+showRoom5.investment);
		System.out.println("ShowRoom5 retail :"+showRoom5.retail);
		System.out.println("ShowRoom5 healthCare :"+showRoom5.healthCare);
		System.out.println("ShowRoom5 color :"+showRoom5.color);
		System.out.println("ShowRoom5 diameterInSquareFeet :"+showRoom5.diameterInSquareFeet);
		
		System.out.println("*************************");
		
		ShowRoom showRoom6=new ShowRoom("grey",100000D);
		System.out.println("ShowRoom6 workers :"+showRoom6.noOfWorkers);
		System.out.println("ShowRoom6 industrial :"+showRoom6.industrial);
		System.out.println("ShowRoom6 loaction :"+showRoom6.loaction);
		System.out.println("ShowRoom6 investment :"+showRoom6.investment);
		System.out.println("ShowRoom6 retail :"+showRoom6.retail);
		System.out.println("ShowRoom6 healthCare :"+showRoom6.healthCare);
		System.out.println("ShowRoom6 color :"+showRoom6.color);
		System.out.println("ShowRoom6 diameterInSquareFeet :"+showRoom6.diameterInSquareFeet);
		
		System.out.println("*************************");
		
		ShowRoom showRoom7=new ShowRoom("Davangere",250);
		System.out.println("ShowRoom7 workers :"+showRoom7.noOfWorkers);
		System.out.println("ShowRoom7 industrial :"+showRoom7.industrial);
		System.out.println("ShowRoom7 loaction :"+showRoom7.loaction);
		System.out.println("ShowRoom7 investment :"+showRoom7.investment);
		System.out.println("ShowRoom7 retail :"+showRoom7.retail);
		System.out.println("ShowRoom7 healthCare :"+showRoom7.healthCare);
		System.out.println("ShowRoom7 color :"+showRoom7.color);
		System.out.println("ShowRoom7 diameterInSquareFeet :"+showRoom7.diameterInSquareFeet);
		
		System.out.println("Ending of main in ShowRoomStarter");
	}
}