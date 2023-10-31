class Ornaments
{
	String types;
	double size;
	String shape;
	double weightIngrams;
	
	Ornaments()
	{
		this("silver",1.0,"diamond",10);
	}
	Ornaments(String types)
	{
		this.types=types;
		System.out.println("type of ornaments....."+types);
	}
	Ornaments(double size)
	{
		this.size=size;
		System.out.println("size of ornaments....."+size);
	}
	Ornaments(double size,String shape)
	{
		this.size=size;
		this.shape=shape;
		System.out.println("size and shape of ornaments....."+size+","+shape);
	}
	Ornaments(String types,double size)
	{
		this.size=size;
		this.types=types;
		System.out.println("size and shape of ornaments....."+size+","+shape);
	}
	Ornaments(String types,double size,String shape,double weightIngrams)
	{
		this.size=size;
		this.shape=shape;
		this.types=types;
		this.weightIngrams=weightIngrams;
		System.out.println("size,shape,types and weightIngrams of ornaments....."+size+","+shape+","+types+","+weightIngrams);
	}
}