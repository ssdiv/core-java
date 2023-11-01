class Helmet
{
	String types;//half-helmet,full-helmet,three-quarter helmet,modular helmet
	char size;//S,M,L
	double length;
	String weight;//weightless,heavy,medium
	String color;
	
	Helmet()
	{
		this("full-helmet",'M',5,"medium","grey");
		System.out.println("Invoking helmet of no-arg const ");
	}
	Helmet(String color)
	{
		this.color=color;
		System.out.println("color of helmet...."+color);
	}	
	Helmet(String types,char size)
	{
		this.types=types;
		this.size=size;
		System.out.println("types,size of helmet...."+types+","+size);
	}
	Helmet(String types,char size,double length)
	{
		this(types,size);
		this.length=length;
		System.out.println("types,size,length of helmet...."+types+","+size+","+length);
	}
	Helmet(String types,char size,double length,String weight)
	{
		this(types,size,length);
		this.weight=weight;
		System.out.println("types,size,length,weight of helmet...."+types+","+size+","+length+","+weight);
	}
	Helmet(String types,char size,double length,String weight,String color)
	{
		this(types,size,length,weight);
		this.color=color;
		System.out.println("types,size,length,weight,color of helmet...."+types+","+size+","+length+","+weight+","+color);
	}
	
}