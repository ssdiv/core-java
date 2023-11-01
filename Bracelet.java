class Bracelet
{
	String material;//metals,leather,wood,copper,stone,feather
	String types;//Wide Bands,Strap Bracelets,Rope-style Bracelets 
	String color;//black,brown,darkgreen
	int prize;
	boolean lockingSystem;
	
	Bracelet()
	{
		this("metal","Wide Bands","black",30,true);
		System.out.println("invoking Bracelet of non-arg const");
	}
	Bracelet(String material)
	{
		this.material=material;
		System.out.println("material used for bracelet......"+material);
	}
	Bracelet(String material,String types)
	{
		this.material=material;
		this.types=types;
		System.out.println("material used,types for bracelet......"+material+","+types);
	}
	Bracelet(String material,String types,String color)
	{
		this(material,types);
		this.color=color;
		System.out.println("material used,types,color for bracelet......"+material+","+types+","+color);
	}
	Bracelet(String material,String types,String color,int prize)
	{
		this(material,types,color);
		this.prize=prize;
		System.out.println("material used,types,color,prize for bracelet......"+material+","+types+","+color+","+prize);
	}
	Bracelet(String material,String types,String color,int prize,boolean lockingSystem)
	{
		this(material,types,color,prize);
		this.lockingSystem=lockingSystem;
		System.out.println("material used,types,color,prize for bracelet......"+material+","+types+","+color+","+prize+","+lockingSystem);
	}
}