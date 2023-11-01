class Carrom
{
	String brand;
	int noOfCarrommen;
	int nets;//10cm
	double standOrTableInCm;//47,0.30
	String strikerShape;
	
	Carrom()
	{
		this("Synco Carrom Boards",9,0.30,5,"round");
		System.out.println("Invoking Carrom of non-arg const");
	}
	Carrom(String brand)
	{
		this.brand=brand;
		System.out.println("Carrom Board Company......"+brand);
	}
	Carrom(String brand,int noOfCarrommen)
	{
		this.brand=brand;
		this.noOfCarrommen=noOfCarrommen;
		System.out.println("Carrom Board Company,noOfCarrommen......"+brand+","+noOfCarrommen);
	}
	Carrom(String brand,int noOfCarrommen,double stand)
	{
		this(brand,noOfCarrommen);
		this.standOrTableInCm=standOrTableInCm;
		System.out.println("Carrom Board Company,noOfCarrommen,stand......"+brand+","+noOfCarrommen+","+standOrTableInCm);
	}
	Carrom(String brand,int noOfCarrommen,double standOrTableInCm,int nets)
	{
		this(brand,noOfCarrommen,standOrTableInCm);
		this.nets=nets;
		System.out.println("Carrom Board Company,noOfCarrommen,stand,nets......"+brand+","+noOfCarrommen+","+standOrTableInCm+","+nets);
	}
	Carrom(String brand,int noOfCarrommen,double standOrTableInCm,int nets,String strikerShape)
	{
		this(brand,noOfCarrommen,standOrTableInCm,nets);
		this.strikerShape=strikerShape;
		System.out.println("Carrom Board Company,noOfCarrommen,stand,nets,strikerShape......"+brand+","+noOfCarrommen+","+standOrTableInCm+","+nets+","+strikerShape);
	}
	
}