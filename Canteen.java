class Canteen{
	
	String type;
	String[] utensils;
	
    Canteen()
		{
			
		}
			
	void setType(String type)
	{
		this.type=type;
	}
	void setUtensils(String[] utensils)
	{
		this.utensils=utensils;
	}
	void display()
	{
		System.out.println("starting of display");
		System.out.println("type :"+this.type);
		System.out.println("utensils :"+this.utensils);
		if(this.utensils!=null)
		{
			for(int seq=0; seq<this.utensils.length; seq++)
			{
			String ref=this.utensils[seq];
			System.out.println("canteen utensils are :"+ref+ " of "+seq);
		}
		
		System.out.println("ending of display");
			}
	
}
}