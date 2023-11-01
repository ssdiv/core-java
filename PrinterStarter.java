class PrienterStarter
{
	public static void main(String[] printers)
	{
		System.out.println("Starting main in PrienterStarter");
		
		Printer printer=new Printer();
		System.out.println("Printer company : "+printer.company);
		System.out.println("Printer noOfCopies : "+printer.noOfCopies);
		System.out.println("Printer color : "+printer.color);
		System.out.println("Printer sides : "+printer.sides);
		System.out.println("Printer company : "+printer.quality);
		
		System.out.println("======================================");
		
		Printer printer1=new Printer("HP");
		System.out.println("Printer1 company : "+printer1.company);
		System.out.println("Printer1 noOfCopies : "+printer1.noOfCopies);
		System.out.println("Printer1 color : "+printer1.color);
		System.out.println("Printer1 sides : "+printer1.sides);
		System.out.println("Printer1 company : "+printer1.quality);
		
		System.out.println("======================================");
		
		Printer printer2=new Printer("canon",10);
		System.out.println("Printer2 company : "+printer2.company);
		System.out.println("Printer2 noOfCopies : "+printer2.noOfCopies);
		System.out.println("Printer2 color : "+printer2.color);
		System.out.println("Printer2 sides : "+printer2.sides);
		System.out.println("Printer2 company : "+printer2.quality);
		
		System.out.println("======================================");
		
		Printer printer3=new Printer("panasonic",3,"red");
		System.out.println("Printer3 company : "+printer3.company);
		System.out.println("Printer3 noOfCopies : "+printer3.noOfCopies);
		System.out.println("Printer3 color : "+printer3.color);
		System.out.println("Printer3 sides : "+printer3.sides);
		System.out.println("Printer3 company : "+printer3.quality);
		
		System.out.println("======================================");
		
		Printer printer4=new Printer("colorjet",7,"pink and black","duplex");
		System.out.println("Printer4 company : "+printer4.company);
		System.out.println("Printer4 noOfCopies : "+printer4.noOfCopies);
		System.out.println("Printer4 color : "+printer4.color);
		System.out.println("Printer4 sides : "+printer4.sides);
		System.out.println("Printer4 company : "+printer4.quality);
		
		System.out.println("Ending main in PrienterStarter");
	}
}