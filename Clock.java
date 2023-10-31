class Clock
{   
	String shape;
	int numbers=5;
	boolean button;
	double rate;
	
	Clock()
	{
		this("Round",3,true,500);
	}
	Clock(String shape)
	{
		this.shape=shape;
		System.out.println("Shape of clock..... :"+shape);
	}
	Clock(double rate)
	{
		this.rate=rate;
		System.out.println("rate of clock......."+rate);
	}
	Clock(String shape,int numbers)
	{
		this.shape=shape;
		this.numbers=numbers;
		System.out.println("Shape and numbers of clock....."+shape+","+numbers);
	}
	Clock(String shape,int numbers,boolean button)
	{
		this.shape=shape;
		this.numbers=numbers;
		this.button=button;
		System.out.println("Shape,numbers and button of clock......"+shape+","+numbers+","+button);
	}
	Clock(String shape,int numbers,boolean button,double rate)
	{
		this.shape=shape;
		this.numbers=numbers;
		this.button=button;
		this.rate=rate;
		System.out.println("Shape,numbers,button and rate of clock......."+shape+","+numbers+","+button+","+rate);
	}
}