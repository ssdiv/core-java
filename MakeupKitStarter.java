class MakeupKitStarter
{
	public static void main(String[] makeup)
	{
		System.out.println("Starting main in MakeupKitStarter");
		
		MakeupKit makeupKit=new MakeupKit();
		System.out.println("brand of makeupKit : "+makeupKit.brand);
		System.out.println("cost of makeupKit : "+makeupKit.cost);
		System.out.println("noOfItems in makeupKit : "+makeupKit.noOfItems);
		System.out.println("colorShades of makeupKit : "+makeupKit.colorShades);
		
		System.out.println("*************************");
		
		MakeupKit makeupKit1=new MakeupKit("sugar");
		System.out.println("brand of makeupKit1 : "+makeupKit1.brand);
		System.out.println("cost of makeupKit1 : "+makeupKit1.cost);
		System.out.println("noOfItems in makeupKit1 : "+makeupKit1.noOfItems);
		System.out.println("colorShades of makeupKit1 : "+makeupKit1.colorShades);
		
		System.out.println("*************************");
		
		MakeupKit makeupKit5=new MakeupKit("gold",12);
		System.out.println("brand of makeupKit5 : "+makeupKit5.brand);
		System.out.println("cost of makeupKit5 : "+makeupKit5.cost);
		System.out.println("noOfItems in makeupKit5 : "+makeupKit5.noOfItems);
		System.out.println("colorShades of makeupKit5 : "+makeupKit5.colorShades);
		
		System.out.println("*************************");
		
		MakeupKit makeupKit2=new MakeupKit("lakeme",199);
		System.out.println("brand of makeupKit2 : "+makeupKit2.brand);
		System.out.println("cost of makeupKit2 : "+makeupKit2.cost);
		System.out.println("noOfItems in makeupKit2 : "+makeupKit2.noOfItems);
		System.out.println("colorShades of makeupKit2 : "+makeupKit2.colorShades);
		
		System.out.println("*************************");
		
		MakeupKit makeupKit3=new MakeupKit("swizzbeauty",260,5);
		System.out.println("brand of makeupKit3 : "+makeupKit3.brand);
		System.out.println("cost of makeupKit3 : "+makeupKit3.cost);
		System.out.println("noOfItems in makeupKit3 : "+makeupKit3.noOfItems);
		System.out.println("colorShades of makeupKit3 : "+makeupKit3.colorShades);
		
		System.out.println("*************************");
		
		MakeupKit makeupKit4=new MakeupKit();
		System.out.println("brand of makeupKit4 : "+makeupKit4.brand);
		System.out.println("cost of makeupKit4 : "+makeupKit4.cost);
		System.out.println("noOfItems in makeupKit4 : "+makeupKit4.noOfItems);
		System.out.println("colorShades of makeupKit4 : "+makeupKit4.colorShades);
		
		System.out.println("Ending main in MakeupKitStarter");
	}
}