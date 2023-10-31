class Wallet
{
	int noOfCompartments;
	String storage;
	int noOfZippes;
	String cardTypes;
	
	Wallet()
	{
		this("debit card","money",5,2);
	}
	Wallet(int noOfCompartments)
	{
		this.noOfCompartments=noOfCompartments;
		System.out.println("noOfCompartments in Wallet......"+noOfCompartments);
	}
	Wallet(String storage)
	{
		this.storage=storage;
		System.out.println("storage in Wallet......"+storage);
	}
	Wallet(int noOfCompartments,String cardTypes)
	{
		this.noOfCompartments=noOfCompartments;
		this.cardTypes=cardTypes;
		System.out.println("noOfCompartments and cardTypes in Wallet......"+noOfCompartments+","+cardTypes);
	}
	Wallet(String cardTypes,int noOfZippes)
	{
		this.cardTypes=cardTypes;
		this.noOfZippes=noOfZippes;
		System.out.println("noOfZippes and cardTypes in Wallet......"+noOfZippes+","+cardTypes);
	}
	Wallet(String cardTypes,String storage,int noOfCompartments,int noOfZippes)
	{
		this.cardTypes=cardTypes;
		this.storage=storage;
		this.noOfCompartments=noOfCompartments;
		this.noOfZippes=noOfZippes;
		System.out.println("storage,noOfCompartments,noOfZippes and cardTypes in Wallet......"+noOfCompartments+","+storage+","+cardTypes+","+noOfZippes);
	}
}