package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster forrestMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		String name = " spoopy monster 9000";
		int eyes = 1;
		int noses= 1 ;
		double legs = 3.5;
		double hair = 2.0;
		boolean hasBellybutton = false;
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		forrestMonster = new MarshmallowMonster(name, eyes, noses, hasBellybutton, legs, hair);
	}
	
	public void start ()
	{
		myDisplay.displayInfo(forrestMonster.toString());
		askQuestions();
		myDisplay.displayInfo("Updated your Monster info! " + forrestMonster.toString());
	}
		
	

	private void askQuestions()
	{
		System.out.println("I-I want a new name as a monster, Master! Please rename me?");
		String newMonsterName = monsterScanner.next();
		forrestMonster.setMonsterName(newMonsterName);
	}

}	