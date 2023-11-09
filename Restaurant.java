class Restaurant{
	
	String ownerName;
	String[] specialitems;
	
	Restaurant()
	{
	}
	
	void setOwnerName(String ownerName)
	{
		
		this.ownerName=ownerName;
	}
	void setSpecialitems(String[] specialitems)
	{
		this.specialitems=specialitems;
	}
	void display()
	{
		System.out.println("starting of display");
		  
		  System.out.println("name:"+this.ownerName);
		  System.out.println("highet:"+this.specialitems);
		if(this.specialitems!=null)
		{
			for(int seq=0; seq<this.specialitems.length; seq++)
			{
				String ref=this.specialitems[seq];
				System.out.println("list of item :" +ref+ " of the " +seq);
			}
			
		}
			
		System.out.println("starting of display");
	}	
	
}