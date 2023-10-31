class MatchBoxStarter
{
	public static void main(String[] matchbox)
	{
		System.out.println("Starting main in MatchBoxStarter");
		
		MatchBox matchBox=new MatchBox();
		System.out.println("MatchBox brand :"+matchBox.brand);
		System.out.println("MatchBox noOfStick :"+matchBox.noOfStick);
		System.out.println("MatchBox length :"+matchBox.length);
		System.out.println("MatchBox prize :"+matchBox.prize);
		System.out.println("MatchBox size :"+matchBox.size);
		System.out.println("MatchBox weight :"+matchBox.weight);
		System.out.println("MatchBox type :"+matchBox.type);
		
		System.out.println("*************************");
		
		MatchBox matchBox1=new MatchBox("Rajashree Match");
		System.out.println("MatchBox1 brand :"+matchBox1.brand);
		System.out.println("MatchBox1 noOfStick :"+matchBox1.noOfStick);
		System.out.println("MatchBox1 length :"+matchBox1.length);
		System.out.println("MatchBox1 prize :"+matchBox1.prize);
		System.out.println("MatchBox1 size :"+matchBox1.size);
		System.out.println("MatchBox1 weight :"+matchBox1.weight);
		System.out.println("MatchBox1 type :"+matchBox1.type);
		
		System.out.println("*************************");
		
		MatchBox matchBox2=new MatchBox("35");
		System.out.println("MatchBox2 brand :"+matchBox2.brand);
		System.out.println("MatchBox2 noOfStick :"+matchBox2.noOfStick);
		System.out.println("MatchBox2 length :"+matchBox2.length);
		System.out.println("MatchBox2 prize :"+matchBox2.prize);
		System.out.println("MatchBox2 size :"+matchBox2.size);
		System.out.println("MatchBox2 weight :"+matchBox2.weight);
		System.out.println("MatchBox2 type :"+matchBox2.type);
		
		System.out.println("*************************");
		
		MatchBox matchBox3=new MatchBox(3.5);
		System.out.println("MatchBox3 brand :"+matchBox3.brand);
		System.out.println("MatchBox3 noOfStick :"+matchBox3.noOfStick);
		System.out.println("MatchBox3 length :"+matchBox3.length);
		System.out.println("MatchBox3 prize :"+matchBox3.prize);
		System.out.println("MatchBox3 size :"+matchBox3.size);
		System.out.println("MatchBox3 weight :"+matchBox3.weight);
		System.out.println("MatchBox3 type :"+matchBox3.type);
		
		System.out.println("*************************");
		
		MatchBox matchBox4=new MatchBox("wood",2.5);
		System.out.println("MatchBox4 brand :"+matchBox4.brand);
		System.out.println("MatchBox4 noOfStick :"+matchBox4.noOfStick);
		System.out.println("MatchBox4 length :"+matchBox4.length);
		System.out.println("MatchBox4 prize :"+matchBox4.prize);
		System.out.println("MatchBox4 size :"+matchBox4.size);
		System.out.println("MatchBox4 weight :"+matchBox4.weight);
		System.out.println("MatchBox4 type :"+matchBox4.type);
		
		System.out.println("*************************");
		
		MatchBox matchBox5=new MatchBox("Asia Matchbox",1);
		System.out.println("MatchBox5 brand :"+matchBox5.brand);
		System.out.println("MatchBox5 noOfStick :"+matchBox5.noOfStick);
		System.out.println("MatchBox5 length :"+matchBox5.length);
		System.out.println("MatchBox5 prize :"+matchBox5.prize);
		System.out.println("MatchBox5 size :"+matchBox5.size);
		System.out.println("MatchBox5 weight :"+matchBox5.weight);
		System.out.println("MatchBox5 type :"+matchBox5.type);
		
		System.out.println("*************************");
		
		MatchBox matchBox6=new MatchBox(40,'M');
		System.out.println("MatchBox6 brand :"+matchBox6.brand);
		System.out.println("MatchBox6 noOfStick :"+matchBox6.noOfStick);
		System.out.println("MatchBox6 length :"+matchBox6.length);
		System.out.println("MatchBox6 prize :"+matchBox6.prize);
		System.out.println("MatchBox6 size :"+matchBox6.size);
		System.out.println("MatchBox6 weight :"+matchBox6.weight);
		System.out.println("MatchBox6 type :"+matchBox6.type);
		
		System.out.println("Ending main in MatchBoxStarter");
	}
}