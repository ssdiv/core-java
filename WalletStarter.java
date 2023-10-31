class WalletStarter
{
	public static void main(String[] wallets)
	{
		System.out.println("Starting of main in WalletStarter");
		
		Wallet wallet=new Wallet();
		System.out.println("number of compartments in wallet :"+wallet.noOfCompartments);
		System.out.println(" storage in wallet :"+wallet.storage);
		System.out.println("noOfZippes in wallet :"+wallet.noOfZippes);
		System.out.println("cardTypes in wallet :"+wallet.cardTypes);
		
		System.out.println("*************************");
		
		Wallet wallet1=new Wallet(6);
		System.out.println("number of compartments in wallet1 :"+wallet1.noOfCompartments);
		System.out.println(" storage in wallet1 :"+wallet1.storage);
		System.out.println("noOfZippes in wallet1 :"+wallet1.noOfZippes);
		System.out.println("cardTypes in wallet1 :"+wallet1.cardTypes);
		
		System.out.println("*************************");
		
		Wallet wallet2=new Wallet("coins");
		System.out.println("number of compartments in wallet2 :"+wallet2.noOfCompartments);
		System.out.println(" storage in wallet2 :"+wallet2.storage);
		System.out.println("noOfZippes in wallet2 :"+wallet2.noOfZippes);
		System.out.println("cardTypes in wallet2 :"+wallet2.cardTypes);
		
		System.out.println("*************************");
		
		Wallet wallet3=new Wallet(8,"credit card");
		System.out.println("number of compartments in wallet3 :"+wallet3.noOfCompartments);
		System.out.println(" storage in wallet3 :"+wallet3.storage);
		System.out.println("noOfZippes in wallet3 :"+wallet3.noOfZippes);
		System.out.println("cardTypes in wallet3 :"+wallet3.cardTypes);
		
		System.out.println("*************************");
		
		Wallet wallet4=new Wallet("pan card",1);
		System.out.println("number of compartments in wallet4 :"+wallet4.noOfCompartments);
		System.out.println(" storage in wallet4 :"+wallet4.storage);
		System.out.println("noOfZippes in wallet4 :"+wallet4.noOfZippes);
		System.out.println("cardTypes in wallet4 :"+wallet4.cardTypes);
		
		System.out.println("Starting of main in WalletStarter");
	}
}