class FreeStarter{
	public static void main(String[] freestarters){
		
		System.out.println("Starting main in FreeStarter");
		
		Free free=new Free("food","offer",5);
		free.displayInfo();
		
		System.out.println("----------------------");
		
		Free free1=new Free("bag","offer",20);
		free1.displayInfo();
		
		System.out.println("----------------------");
		
		Free free2=new Free("phone","exchangeoffer",25);
		free2.displayInfo();
		
		System.out.println("----------------------");
		
		Free free3=new Free("cloths","offer",30);
		free3.displayInfo();
		
		System.out.println("----------------------");
		
		Free free4=new Free("juice","Coupon",35);
		free4.displayInfo();
		
		System.out.println("----------------------");
		
		Free free5=new Free("soundbox","Exchangeoffer",13);
		free5.displayInfo();
		
		System.out.println("----------------------");
		
		Free free6=new Free("shampoo","Vocher",5);
		free6.displayInfo();
		
		System.out.println("----------------------");
		
		Free free7=new Free("washing machine","LuckyVocher",15);
		free7.displayInfo();
		
		System.out.println("----------------------");
		
		Free free8=new Free("movies","Coupon",39);
		free8.displayInfo();
		
		System.out.println("----------------------");
		
		Free free9=new Free("lottery","LuckyDraw",18);
		free9.displayInfo();
		
		System.out.println("----------------------");
		
		Free free10=new Free("vehicles","Festivaloffer",34);
		free10.displayInfo();
		
		System.out.println("----------------------");
		
		Free free11=new Free("pouches","Vocher",10);
		free11.displayInfo();
		
		System.out.println("Ending main in FreeStarter");
	}
}