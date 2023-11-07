class Starter
{
 
    public static void main(String [] start)
    {
	System.out.println("Starting main in Starter");
	Color color=Color.Purple;
	Tent tent=new Tent();
	Agent agent=new Agent();
	tent.showInfo(33,color,35,30);
	agent.openTent(tent);
	agent.closeTent(tent);
	agent.showInfo();
	System.out.println("ending main in Starter");
    }
}