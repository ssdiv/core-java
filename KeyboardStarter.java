class KeyboardStarter
{
	public static void main(String[] Keyboard)
	{
		System.out.println("Starting of main in KeyboardStarter");
		
		Keyboard keyboard=new Keyboard();
		System.out.println("Keyboard brand :"+keyboard.brand);
		System.out.println("Keyboard color :"+keyboard.color);
		System.out.println("Keyboard noOfKeys :"+keyboard.noOfKeys);
		System.out.println("Keyboard type :"+keyboard.type);
		System.out.println("Keyboard cost :"+keyboard.cost);
		
		System.out.println("*************************");
		
		Keyboard keyboard1=new Keyboard("APPLE");
		System.out.println("Keyboard1 brand :"+keyboard1.brand);
		System.out.println("Keyboard1 color :"+keyboard1.color);
		System.out.println("Keyboard1 noOfKeys :"+keyboard1.noOfKeys);
		System.out.println("Keyboard1 type :"+keyboard1.type);
		System.out.println("Keyboard1 cost :"+keyboard1.cost);
		
		System.out.println("*************************");
		
		Keyboard keyboard2=new Keyboard(102);
		System.out.println("Keyboard2 brand :"+keyboard2.brand);
		System.out.println("Keyboard2 color :"+keyboard2.color);
		System.out.println("Keyboard2 noOfKeys :"+keyboard2.noOfKeys);
		System.out.println("Keyboard2 type :"+keyboard2.type);
		System.out.println("Keyboard2 cost :"+keyboard2.cost);
		
		System.out.println("*************************");
		
		Keyboard keyboard3=new Keyboard(1024.0);
		System.out.println("Keyboard3 brand :"+keyboard3.brand);
		System.out.println("Keyboard3 color :"+keyboard3.color);
		System.out.println("Keyboard3 noOfKeys :"+keyboard3.noOfKeys);
		System.out.println("Keyboard3 type :"+keyboard3.type);
		System.out.println("Keyboard3 cost :"+keyboard3.cost);
		
		System.out.println("*************************");
		
		Keyboard keyboard5=new Keyboard("Dell",104);
		System.out.println("Keyboard5 brand :"+keyboard5.brand);
		System.out.println("Keyboard5 color :"+keyboard5.color);
		System.out.println("Keyboard5 noOfKeys :"+keyboard5.noOfKeys);
		System.out.println("Keyboard5 type :"+keyboard5.type);
		System.out.println("Keyboard5 cost :"+keyboard5.cost);
		
		System.out.println("*************************");
		
		Keyboard keyboard6=new Keyboard("wired",885.0);
		System.out.println("Keyboard6 brand :"+keyboard6.brand);
		System.out.println("Keyboard6 color :"+keyboard6.color);
		System.out.println("Keyboard6 noOfKeys :"+keyboard6.noOfKeys);
		System.out.println("Keyboard6 type :"+keyboard6.type);
		System.out.println("Keyboard6 cost :"+keyboard6.cost);
		
		System.out.println("*************************");
		
		System.out.println("Ending of main in KeyboardStarter");

	}
}