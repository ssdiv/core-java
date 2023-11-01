class KeyChain
{
	String typeOfKeys;//house key,car key
	boolean flashLight;//on,off
	boolean selfDefenceAlarm;
	double sizeInInch;
	String stores;//username,password,info
	
	KeyChain()
	{
		this("car key",false,true,1.5,"username");
		System.out.println("Invoking KeyChain of no-arg const");
	}
	KeyChain(String typeOfKeys)
	{
		this.typeOfKeys=typeOfKeys;
		System.out.println("Different keys of keychains....."+typeOfKeys);
	}
	KeyChain(String typeOfKeys,boolean flashLight)
	{
		this.typeOfKeys=typeOfKeys;
		this.flashLight=flashLight;
		System.out.println("typeOfKeys,flashLight of keychains....."+typeOfKeys+","+flashLight);
	}
	KeyChain(String typeOfKeys,boolean flashLight,boolean selfDefenceAlarm)
	{
		this(typeOfKeys,flashLight);
		this.selfDefenceAlarm=selfDefenceAlarm;
		System.out.println("Different keys,flashLight,selfDefenceAlarm of keychains....."+typeOfKeys+","+flashLight+","+selfDefenceAlarm);
	}
	KeyChain(String typeOfKeys,boolean flashLight,boolean selfDefenceAlarm,double sizeInInch)
	{
		this(typeOfKeys,flashLight,selfDefenceAlarm);
		this.sizeInInch=sizeInInch;
		System.out.println("Different keys,flashLight,selfDefenceAlarm,sizeInInch of keychains....."+typeOfKeys+","+flashLight+","+selfDefenceAlarm+","+sizeInInch);
	}
	KeyChain(String typeOfKeys,boolean flashLight,boolean selfDefenceAlarm,double sizeInInch,String stores)
	{
		this(typeOfKeys,flashLight,selfDefenceAlarm,sizeInInch);
		this.stores=stores;
		System.out.println("Different keys,flashLight,selfDefenceAlarm,sizeInInch,stores of keychains....."+typeOfKeys+","+flashLight+","+selfDefenceAlarm+","+sizeInInch+","+stores);
	}
}