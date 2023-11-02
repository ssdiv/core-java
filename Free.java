class Free
{
	String why;
	String what;
	int freeforAll;
	
	Free(String why,String what,int freeforAll)
	{
		this.why=why;
		this.what=what;
		this.freeforAll=freeforAll;
		System.out.println("invoking Free with String,String int Constructor");
	}
	void displayInfo()
	{
		
		System.out.println("Starting displayInfo");
		System.out.println(this.why=why);
		System.out.println(this.freeforAll=freeforAll);
		System.out.println(this.what=what);
		System.out.println("Ending displayInfo");	
	}
}