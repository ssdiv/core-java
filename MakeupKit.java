class MakeupKit
{
	 String brand;
	 double cost;
	 int noOfItems;
	 String colorShades;
	 
	 MakeupKit()
	 {
		 this("Insight",255.0,10,"amber");
	 }
	 MakeupKit(String brand)
	 {
		 this.brand=brand;
		 System.out.println("brand makeupkit...."+brand);
	 }
	 MakeupKit(String colorShades,int noOfItems)
	 {
		 this.colorShades=colorShades;
		 this.noOfItems=noOfItems;
		 System.out.println("colorShades and noOfItems in makeupkit...."+colorShades+","+noOfItems);
	 }
	 MakeupKit(String brand,double cost)
	 {
		 this.brand=brand;
		 this.cost=cost;
		 System.out.println("brand and cost of makeupkit...."+brand+","+cost);
	 }
	 MakeupKit(String brand,double cost,int noOfItems)
	 {
		 this.brand=brand;
		 this.cost=cost;
		 this.noOfItems=noOfItems;
		 System.out.println("brand,cost and noOfItems of makeupkit...."+brand+","+cost+","+noOfItems);
	 }
	 MakeupKit(String brand,double cost,int noOfItems,String colorShades)
	 {
		 this.brand=brand;
		 this.cost=cost;
		 this.noOfItems=noOfItems;
		 this.colorShades=colorShades;
		 System.out.println("brand,cost,noOfItems and colorShades of makeupkit...."+brand+","+cost+","+noOfItems+","+colorShades);
	 }
}