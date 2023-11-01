class KeyChainStarter
{
	public static void main(String[] keychains)
	{
		System.out.println("Starting main in KeyChainStarter");
		
		KeyChain keyChain=new KeyChain();
		System.out.println("type of keyChain :"+keyChain.typeOfKeys);
		System.out.println("keyChain flashLight :"+keyChain.flashLight);
		System.out.println("keyChain selfDefenceAlarm :"+keyChain.selfDefenceAlarm);
		System.out.println("keyChain sizeInInch :"+keyChain.sizeInInch);
		System.out.println("keyChain stores :"+keyChain.stores);
		
		System.out.println("*************************");
		
		KeyChain keyChain1=new KeyChain("house key");
		System.out.println("type of keyChain1 :"+keyChain1.typeOfKeys);
		System.out.println("keyChain1 flashLight :"+keyChain1.flashLight);
		System.out.println("keyChain1 selfDefenceAlarm :"+keyChain1.selfDefenceAlarm);
		System.out.println("keyChain1 sizeInInch :"+keyChain1.sizeInInch);
		System.out.println("keyChain1 stores :"+keyChain1.stores);
		
		System.out.println("*************************");
		
		KeyChain keyChain2=new KeyChain("bike key",true);
		System.out.println("type of keyChain2 :"+keyChain2.typeOfKeys);
		System.out.println("keyChain2 flashLight :"+keyChain2.flashLight);
		System.out.println("keyChain2 selfDefenceAlarm :"+keyChain2.selfDefenceAlarm);
		System.out.println("keyChain2 sizeInInch :"+keyChain2.sizeInInch);
		System.out.println("keyChain2 stores :"+keyChain2.stores);
		
		System.out.println("*************************");
		
		KeyChain keyChain3=new KeyChain("room key",false,true);
		System.out.println("type of keyChain3 :"+keyChain3.typeOfKeys);
		System.out.println("keyChain3 flashLight :"+keyChain3.flashLight);
		System.out.println("keyChain3 selfDefenceAlarm :"+keyChain3.selfDefenceAlarm);
		System.out.println("keyChain3 sizeInInch :"+keyChain3.sizeInInch);
		System.out.println("keyChain3 stores :"+keyChain3.stores);
		
		System.out.println("*************************");
		
		KeyChain keyChain4=new KeyChain("bag key",true,false,1.0);
		System.out.println("type of keyChain4 :"+keyChain4.typeOfKeys);
		System.out.println("keyChain4 flashLight :"+keyChain4.flashLight);
		System.out.println("keyChain4 selfDefenceAlarm :"+keyChain4.selfDefenceAlarm);
		System.out.println("keyChain4 sizeInInch :"+keyChain4.sizeInInch);
		System.out.println("keyChain4 stores :"+keyChain4.stores);
		
		System.out.println("Starting main in KeyChainStarter");
	}
}