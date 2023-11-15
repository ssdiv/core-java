class Address{
	
	String street;
	int pincode;
	City city;
	
	Address()
	{
	}
	 
	 void setStreet(String street)
	 {
		 this.street=street;
	 }
	 
	 void setPincode(int pincode)
	 {
		 this.pincode=pincode;
		
	 }
	 void cityMethod(City city)
	 {
		 this.city=city;
	 }
	 
	 void show()
	 {
		 System.out.println("show information of Address");
	      System.out.println("Street :"+this.street);
			System.out.println("pincode :"+this.pincode);
			System.out.println("city :"+this.city);
			if(this.city!=null)
			{
				this.city.show();
			}
			
          System.out.println("end information of Address");
}
}