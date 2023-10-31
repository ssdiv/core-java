class OrnamentsStarter
{
	public static void main(String[] ornament)
	{
		System.out.println("Starting of main in OrnamentsStarter");
		
		Ornaments ornaments=new Ornaments();
		System.out.println("ornament type : "+ornaments.types);
		System.out.println("ornament size : "+ornaments.size);
		System.out.println("ornament shape : "+ornaments.shape);
		System.out.println("ornament weightIngrams : "+ornaments.weightIngrams);
		
		System.out.println("*************************");
		
		Ornaments ornaments1=new Ornaments("gold");
		System.out.println("ornament1 type : "+ornaments1.types);
		System.out.println("ornament1 size : "+ornaments1.size);
		System.out.println("ornament1 shape : "+ornaments1.shape);
		System.out.println("ornament1 weightIngrams : "+ornaments1.weightIngrams);
		
		System.out.println("*************************");
		
		Ornaments ornaments2=new Ornaments(1.5);
		System.out.println("ornament2 type : "+ornaments2.types);
		System.out.println("ornament2 size : "+ornaments2.size);
		System.out.println("ornament2 shape : "+ornaments2.shape);
		System.out.println("ornament2 weightIngrams : "+ornaments2.weightIngrams);
		
		System.out.println("*************************");
		
		Ornaments ornaments3=new Ornaments(2.0,"round");
		System.out.println("ornament3 type : "+ornaments3.types);
		System.out.println("ornament3 size : "+ornaments3.size);
		System.out.println("ornament3 shape : "+ornaments3.shape);
		System.out.println("ornament3 weightIngrams : "+ornaments3.weightIngrams);
		
		System.out.println("*************************");
		
		Ornaments ornaments4=new Ornaments("platenum",1.8);
		System.out.println("ornament4 type : "+ornaments4.types);
		System.out.println("ornament4 size : "+ornaments4.size);
		System.out.println("ornament4 shape : "+ornaments4.shape);
		System.out.println("ornament4 weightIngrams : "+ornaments4.weightIngrams);
		
		System.out.println("ending of main in OrnamentsStarter");
	}
}