class ATM{
	
	String bankName="Karnataka";
	String[] branch;  //5
	String[] accs; //3
	String[] cctvBrand; //5
	
		ATM(String[] branch,String[] accs,String[] cctvBrand)
	{
		this.branch=branch;
		this.accs=accs;
		this.cctvBrand=cctvBrand;
	}
	
	 void display()
	 {
		 		System.out.println("starting of display");
				
				System.out.println("Branch:"+this.branch);
				if(this.branch!=null)
				{
					for(int seq=0; seq<this.branch.length; seq++)
					{
						String ref=this.branch[seq];
						System.out.println("bransh are:"+ref+ " of "+seq);
					}
				}
				
				System.out.println("access :"+this.accs);
				if(this.accs!=null)
				{
					for(int seq=0; seq<this.accs.length; seq++)
					{
						String ref=this.accs[seq];
						System.out.println("bransh are:"+ref+ " of "+seq);
					}
				}
	            System.out.println("cctvbrand :"+this.cctvBrand);
				if(this.cctvBrand!=null)
				{
					for(int seq=0; seq<this.cctvBrand.length; seq++)
					{
						String ref=this.cctvBrand[seq];
						System.out.println("bransh are:"+ref+ " of "+seq);
					}
				}
				System.out.println("ending of display");
	 }