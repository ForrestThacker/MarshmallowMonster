package marshmallows.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellybutton;
	
	private MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String monsterName, int monsterEyes,
								 int monsterNoses, boolean monsterBellybutton,
								double monsterLegs, double monsterHair)
	{									
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterBellybutton = monsterBellybutton;
		this.monsterNoses = monsterNoses;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
	}
	
	public String toString()
	{
		String monsterInfo = "My monster has " + monsterLegs + " legs, " + monsterNoses + " noses, " + monsterEyes + " eyes, and his name is" + monsterName;
		
		return monsterInfo;
		
	}
}