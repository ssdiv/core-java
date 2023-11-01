class BraceletStarter
{
	public static void main(String[] bracelets)
	{
		System.out.println("Starting of main in BraceletStarter");
		
		Bracelet bracelet=new Bracelet();
		System.out.println("Bracelet material : "+bracelet.material);
		System.out.println("Bracelet types : "+bracelet.types);
		System.out.println("Bracelet color : "+bracelet.color);
		System.out.println("Bracelet prize : "+bracelet.prize);
		System.out.println("Bracelet lockingSystem : "+bracelet.lockingSystem);
		
		System.out.println("*************************");
		
		Bracelet bracelet1=new Bracelet("feather");
		System.out.println("Bracelet1 material : "+bracelet1.material);
		System.out.println("Bracelet1 types : "+bracelet1.types);
		System.out.println("Bracelet1 color : "+bracelet1.color);
		System.out.println("Bracelet1 prize : "+bracelet1.prize);
		System.out.println("Bracelet1 lockingSystem : "+bracelet1.lockingSystem);
		
		System.out.println("*************************");
		
		Bracelet bracelet2=new Bracelet("wood","Strap Bracelets");
		System.out.println("Bracelet2 material : "+bracelet2.material);
		System.out.println("Bracelet2 types : "+bracelet2.types);
		System.out.println("Bracelet2 color : "+bracelet2.color);
		System.out.println("Bracelet2 prize : "+bracelet2.prize);
		System.out.println("Bracelet2 lockingSystem : "+bracelet2.lockingSystem);
		
		System.out.println("*************************");
		
		Bracelet bracelet3=new Bracelet("leather","Rope-style Bracelets","brown");
		System.out.println("Bracelet3 material : "+bracelet3.material);
		System.out.println("Bracelet3 types : "+bracelet3.types);
		System.out.println("Bracelet3 color : "+bracelet3.color);
		System.out.println("Bracelet3 prize : "+bracelet.prize);
		System.out.println("Bracelet3 lockingSystem : "+bracelet.lockingSystem);
		
		System.out.println("*************************");
		
		Bracelet bracelet4=new Bracelet("feather","wide bands","darkgreen",100);
		System.out.println("Bracelet4 material : "+bracelet4.material);
		System.out.println("Bracelet4 types : "+bracelet4.types);
		System.out.println("Bracelet4 color : "+bracelet4.color);
		System.out.println("Bracelet4 prize : "+bracelet4.prize);
		System.out.println("Bracelet4 lockingSystem : "+bracelet4.lockingSystem);
		
		System.out.println("ending of main in BraceletStarter");
	}
}