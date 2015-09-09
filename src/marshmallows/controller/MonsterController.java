package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster forrestMonster;
	
	public MonsterController()
	{
		String name = "";
		int eyes = 1;
		int noses= 0;
		double legs = 3.0;
		double hair = 2.0;
		boolean hasBellybutton = false;
		
		forrestMonster = new MarshmallowMonster(name, eyes, noses, hasBellybutton, legs, hair);
	}
	
	public void start ()
	{
	}

}	