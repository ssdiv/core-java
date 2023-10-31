class ClockStarter
{
	public static void main(String[] clocks)
	{
		System.out.println("Starting main in ClockStarter");
		
		Clock clock=new Clock();
		System.out.println("shape of clock : "+clock.shape);
		System.out.println("numbers of clock : "+clock.numbers);
		System.out.println("button of clock : "+clock.button);
		System.out.println("shape of clock : "+clock.shape);
		
		System.out.println("*************************");
		
		Clock clock1=new Clock("Square");
		System.out.println("shape of clock1 : "+clock1.shape);
		System.out.println("numbers of clock1 : "+clock1.numbers);
		System.out.println("button of clock1 : "+clock1.button);
		System.out.println("shape of clock1 : "+clock1.shape);
		
		System.out.println("*************************");
		
		Clock clock2=new Clock(400);
		System.out.println("shape of clock2 : "+clock2.shape);
		System.out.println("numbers of clock2 : "+clock2.numbers);
		System.out.println("button of clock2 : "+clock2.button);
		System.out.println("shape of clock2 : "+clock2.shape);
		
		System.out.println("*************************");
		
		Clock clock3=new Clock("rectangle",10);
		System.out.println("shape of clock3 : "+clock3.shape);
		System.out.println("numbers of clock3 : "+clock3.numbers);
		System.out.println("button of clock3 : "+clock3.button);
		System.out.println("shape of clock3 : "+clock3.shape);
		
		System.out.println("*************************");
		
		Clock clock4=new Clock("oval",12,true);
		System.out.println("shape of clock4 : "+clock4.shape);
		System.out.println("numbers of clock4 : "+clock4.numbers);
		System.out.println("button of clock4 : "+clock4.button);
		System.out.println("shape of clock4 : "+clock4.shape);
		
		System.out.println("Ending main in ClockStarter");
	}
}