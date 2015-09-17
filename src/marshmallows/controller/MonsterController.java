package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster forrestMonster; //Declares a Monster called forrestMonster.
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	private MarshmallowMonster userMonster;
	
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
		createUserMonster();
		myDisplay.displayInfo("Updated your Monster info! " + userMonster.toString());
	}
		
	

	private void askQuestions()
	{
		System.out.println("I-I want a new name as a monster, Master! Please rename me?");
		String newMonsterName = monsterScanner.next();
		forrestMonster.setMonsterName(newMonsterName);
		System.out.println("H-How about we change my nose, Master?");
		int updateNoses = monsterScanner. nextInt();
		System.out.println("T-Thank you, Master? How about my eyes now?");
		int updateEyes = monsterScanner. nextInt();
		System.out.println("Thank you Master! H-How about my legs now?");
		double updatedLegs = monsterScanner.nextDouble();
		System.out.println("I-I would like a new hairstyle, Master...");
		double updatedHair = monsterScanner.nextDouble();
		System.out.println("Should I change my bellybutton Master?");
		int updateBellybutton = monsterScanner. nextInt();
	}
		/**
		 * Creates a MarshmallowMonster instance from user input.
		 */
		private void createUserMonster()
		{
			//Step one: Gather user information.
			System.out.println("What is your monster's name?");
			String userName;
			userName = monsterScanner.next();
			System.out.println("How many legs will it have?");
			double userLegs = monsterScanner.nextDouble();
			System.out.println("How much hair does it have, another decimal value");
			double userHair;
			userHair = monsterScanner.nextDouble();
			System.out.println("Does it have a belly button - true or false?");
			boolean hasBellyButton = monsterScanner.nextBoolean();
			System.out.println("Number of eyes on the monster?");
			int userEyes = monsterScanner.nextInt();
			System.out.println("Combien de nez?");
			int userNoses = monsterScanner.nextInt();
			
			//Step two: Build the monster using the constructor.
			userMonster = new MarshmallowMonster(userName, userEyes, userNoses, hasBellyButton, userHair, userLegs);
			
		}
}