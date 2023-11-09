class ATMStarter{
     public static void main(String args[])
	{
		System.out.println("Starting of the main method");
		
		String[] branch=new String[5];
		branch[0]="Davangere";
		branch[1]="Chitadurga";
		branch[2]="darwad";
		branch[3]="hassan";
		branch[4]="mandya";
	
		String[] accs=new String[3];
		accs[0]="LG";
		accs[1]="voltas";
		accs[2]="samsung";
				
		String[] cctvBrand=new String[5];
		cctvBrand[0]="sony";
		cctvBrand[1]="cp plus";
		cctvBrand[2]="bosch";
		cctvBrand[3]="pelco";
		cctvBrand[4]="d-link";
		
		ATM atm=new ATM(branch,accs,cctvBrand);
		atm.display();
		
	
		System.out.println("Starting of the main method");
	}	
		
}