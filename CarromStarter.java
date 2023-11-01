class CarromStarter
{
	public static void main(String[] carromboard)
	{
		System.out.println("Starting of main in CarromStarter");
		
		Carrom carrom=new Carrom();
		System.out.println("Carrom brand : "+carrom.brand);
		System.out.println("Carrom noOfCarrommen : "+carrom.noOfCarrommen);
		System.out.println("Carrom nets : "+carrom.nets);
		System.out.println("Carrom standOrTableInCm : "+carrom.standOrTableInCm);
		System.out.println("Carrom strikerShape : "+carrom.strikerShape);
		
		System.out.println("======================================");
		
		Carrom carrom1=new Carrom("Suzuki Carrom Board");
		System.out.println("Carrom1 brand : "+carrom1.brand);
		System.out.println("Carrom1 noOfCarrommen : "+carrom1.noOfCarrommen);
		System.out.println("Carrom1 nets : "+carrom1.nets);
		System.out.println("Carrom1 standOrTableInCm : "+carrom1.standOrTableInCm);
		System.out.println("Carrom1 strikerShape : "+carrom1.strikerShape);
		
		System.out.println("======================================");
		
		Carrom carrom2=new Carrom("Siscaa Carrom Boards",9);
		System.out.println("Carrom2 brand : "+carrom2.brand);
		System.out.println("Carrom2 noOfCarrommen : "+carrom2.noOfCarrommen);
		System.out.println("Carrom2 nets : "+carrom2.nets);
		System.out.println("Carrom2 standOrTableInCm : "+carrom2.standOrTableInCm);
		System.out.println("Carrom2 strikerShape : "+carrom2.strikerShape);
		
		System.out.println("======================================");
		
		Carrom carrom3=new Carrom("Uber Carrom Boards",1,47);
		System.out.println("Carrom3 brand : "+carrom3.brand);
		System.out.println("Carrom3 noOfCarrommen : "+carrom3.noOfCarrommen);
		System.out.println("Carrom3 nets : "+carrom3.nets);
		System.out.println("Carrom3 standOrTableInCm : "+carrom3.standOrTableInCm);
		System.out.println("Carrom3 strikerShape : "+carrom3.strikerShape);
		
		System.out.println("======================================");
		
		Carrom carrom4=new Carrom("JD Sports Carrom Boards",1,0.25,8);
		System.out.println("Carrom4 brand : "+carrom4.brand);
		System.out.println("Carrom4 noOfCarrommen : "+carrom4.noOfCarrommen);
		System.out.println("Carrom4 nets : "+carrom4.nets);
		System.out.println("Carrom4 standOrTableInCm : "+carrom4.standOrTableInCm);
		System.out.println("Carrom4 strikerShape : "+carrom4.strikerShape);
		
		System.out.println("Ending of main in CarromStarter");
	}
}