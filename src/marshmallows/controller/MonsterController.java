package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;

public class MonsterController
{
	private MarshmallowMonster forrestMonster;
	private MonsterDisplay myDisplay;
	
	public MonsterController()
	{
		String name = " spoopy monster 9000";
		int eyes = 1;
		int noses= 1 ;
		double legs = 3.5;
		double hair = 2.0;
		boolean hasBellybutton = false;
		
		myDisplay = new MonsterDisplay();
		forrestMonster = new MarshmallowMonster(name, eyes, noses, hasBellybutton, legs, hair);
	}
	public void start (){
		myDisplay.displayInfo(forrestMonster.toString());}


}	