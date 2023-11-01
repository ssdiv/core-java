class HelmetStarter
{
	public static void main(String[] helmets)
	{
		System.out.println("starting of main in HelmetStarter");
		
		Helmet helmet=new Helmet();
		System.out.println("types of helmet :"+helmet.types);
		System.out.println("size of helmet :"+helmet.size);
		System.out.println("length of helmet :"+helmet.length);
		System.out.println("weight of helmet :"+helmet.weight);
		System.out.println("color of helmet :"+helmet.color);
		
		System.out.println("======================================");
		
		Helmet helmet5=new Helmet("white");
		System.out.println("types of helmet5 :"+helmet5.types);
		System.out.println("size of helmet5 :"+helmet5.size);
		System.out.println("length of helmet5 :"+helmet5.length);
		System.out.println("weight of helmet5 :"+helmet5.weight);
		System.out.println("color of helmet5 :"+helmet5.color);
		
		System.out.println("======================================");
		
		Helmet helmet1=new Helmet("half-helmet",'S');
		System.out.println("types of helmet1 :"+helmet1.types);
		System.out.println("size of helmet1 :"+helmet1.size);
		System.out.println("length of helmet1 :"+helmet1.length);
		System.out.println("weight of helmet1 :"+helmet1.weight);
		System.out.println("color of helmet1 :"+helmet1.color);
		
		System.out.println("======================================");
		
		Helmet helmet2=new Helmet("modular helmet",'L',6);
		System.out.println("types of helmet2 :"+helmet2.types);
		System.out.println("size of helmet2 :"+helmet2.size);
		System.out.println("length of helmet2 :"+helmet2.length);
		System.out.println("weight of helmet2 :"+helmet2.weight);
		System.out.println("color of helmet2 :"+helmet2.color);
		
		System.out.println("======================================");
		
		Helmet helmet3=new Helmet("three-quarter helmet",'S',3,"weightless");
		System.out.println("types of helmet3 :"+helmet3.types);
		System.out.println("size of helmet3 :"+helmet3.size);
		System.out.println("length of helmet3 :"+helmet3.length);
		System.out.println("weight of helmet3 :"+helmet3.weight);
		System.out.println("color of helmet3 :"+helmet3.color);
		
		System.out.println("ending of main in HelmetStarter");
	}
}