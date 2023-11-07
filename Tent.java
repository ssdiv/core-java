class Tent
{
int slno;
Color color;
double width;
double height;

   boolean open()
   {
     System.out.println("tent is opened: ");
     return true;
   }
   boolean close()
   {
     System.out.println("tent is closed: ");
     return false;
   }
   void showInfo(int slno,Color color,double width,double height)
   {
	this.color=color;
	this.slno=slno;
	this.width=width;
	this.height=height;
	System.out.println("Starting showing in tent: ");
    System.out.println("tent slno is : "+slno);
	if (color!=null)
	{
		System.out.println("tent color is : "+color.Purple);
		System.out.println("tent color is : "+color.Grey);
		System.out.println("tent color is : "+color.LightBlue);
	}
	System.out.println("tent width is : "+width);
	System.out.println("ending showInfo in tent");
	
	System.out.println("====================");
   }
}