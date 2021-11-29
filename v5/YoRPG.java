/**********************************************

3 Lucky Duckies - Ziying Jian, Nora Miller, Gloria Lee
APCS
Lab01 -- An Adventurer is You!
2021-11-22
time spent: 7 hrs

DISCO:
* Having a try...catch... block is good standard convention for accounting for errors in user input
* extends - copies the functionality of the parent class into the subclass
* versus creating an instance of the class
* You can check not just an arithmetic expression but also for an instance of a class
* Default constructors can be used to initialize instance vars
* private Monster smaug stores an instance of a class as an object


QCC:
* What functionality does java.io and java.util each provide?
* When would you employ try...catch... blocks?
* What does IOException do? What happens after an exception is caught?

v4 to v5 changes:

* Protagonists have the new option to dodge, taking 0 damage and dealing 0 damage, but they lose 10 health every time they dodge for being a coward.
* Monsters now have a 1 out of 10 chance of unlocking a brief powerup, where their damage is multiplied by 3. You can test your luck by seeing if you can dodge a powerup attack.
* Salvisanguins heal 10 health each round.
* Modified subclass stats for more balanced gameplay.

OUR DRIVER MODS:
  * Players can now choose a protagonist subclass to play as
  * Implemented a RNG function so that all three monster subclasses have equal chance of being encountered.
  * Before choosing a Protagonist subclass, players have the option to view about descriptions for all Protagonist subclasses.
  * Added about descriptions so that they print out all atk/def/hp/etc. stats along wtih description too
  * Added safeguard measures so that when users choose difficulty >3 or try to choose a Protagonist subclass unavailable, users are prompted to input an input that is valid.
  * Protagonists have the new option to dodge, taking 0 damage and dealing 0 damage, but they lose 10 health every time they dodge for being a coward.
  * Monsters now have a 1 out of 3 chance of unlocking a brief powerup, where their damage is multiplied by 3. You can test your luck by seeing if you can dodge a powerup attack.
  * Monsters now have passives. Salvisanguins heal, Imperiphors increase defense, and Cambrilevars "self destruct" after each round.
  * Protagonists and Monsters have a 1/10 chance of naturally dodging attacks!

 **********************************************/

import java.io.*;
import java.util.*;

public class YoRPG {

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

  //change this constant to set number of encounters in a game
  public final static int MAX_ENCOUNTERS = 5;

  //each round, a Protagonist and a Monster will be instantiated...
  private Protagonist pat;
  private Monster smaug;

  private int moveCount;
  private boolean gameOver;
  private int difficulty;

  private InputStreamReader isr;
  private BufferedReader in;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
  public YoRPG() {
    moveCount = 0;
    gameOver = false;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
  }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

  /*=============================================
    void newGame() -- gathers info to begin a new game
    pre:
    post: according to user input, modifies instance var for difficulty
    and instantiates a Protagonist
    =============================================*/
  public void newGame() {
    String s;
    String name = "";
    int type ;
    s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

    s += "\nChoose your difficulty: \n";
    s += "\t1: Easy\n";
    s += "\t2: Not so easy\n";
    s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
    s += "Selection: ";
    System.out.print( s );

    try {
      difficulty = Integer.parseInt( in.readLine() );
      while(true){

      if(difficulty>=1 && difficulty <=3){
        break;
      }
      else{
        System.out.println("\n\tNot a valid input. Please select value between 1 and 3 inclusive.");
        difficulty = Integer.parseInt( in.readLine() );
      }
    }
    }
    catch ( IOException e ) { }

    s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
    System.out.print( s );

    try {
      name = in.readLine();
    }
    catch(IOException e){
    }


    String a="";
    a += "\nChoose your form of greatnesss: \n";
  	a += "\t1: Bruiser\n";
    a += "\t2: Tank\n";
    a += "\t3: Mage\n";
    a += "\t4: More info on Bruisers\n";
    a += "\t5: More info on Tanks\n";
    a += "\t6: More info on Mages\n";
    a += "\tSelection: \n";

	System.out.println(a);


  //instantiate the player's character
  try {
    type = Integer.parseInt( in.readLine() );
    while(true){ //true is so that the loop repeats infinitely unless it hits a break
       if(type == 1){
   			pat = new Bruiser(name);
        break;
 		  }
 		  else if(type == 2){
   			pat = new Tank(name);
        break;
 		  }
 		  else if(type == 3){
   			pat = new Mage(name);
        break;
      }
      else if(type == 4) {

        System.out.println(Bruiser.about());
        System.out.println(a);
        type = Integer.parseInt( in.readLine() );
 		  }
      else if(type ==5){
        System.out.println(Tank.about());
        System.out.println(a);
        type = Integer.parseInt( in.readLine());
      }
      else if(type ==6){
        System.out.println(Mage.about());
        System.out.println(a);
        type = Integer.parseInt( in.readLine());
      }
      else{
        System.out.println("\n\tNot valid input value.");
        System.out.println("Choose a number between 1 and 6 inclusive.");
        type = Integer.parseInt( in.readLine());
      }

 	  }
  }  catch(IOException e){
    pat = new Protagonist(name);
 	}



  }//end newGame()


  /*=============================================
    boolean playTurn -- simulates a round of combat
    pre:  Protagonist pat has been initialized
    post: Returns true if player wins (monster dies).
    Returns false if monster wins (player dies).
    =============================================*/
  public boolean playTurn() {
    int i = 1;
    int d1, d2;

    if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
    else {
	    System.out.println( "\nLo, yonder monster approacheth!" );


      int dice = (int)(Math.random()*3);
      if (dice == 0){
        smaug = new Salvisanguin();
        System.out.println("new Salvisanguin!");
      }
      else if(dice ==1){
        smaug = new Cambrilevar();
        System.out.println("new Cambrilevar!");
      }
      else{
        smaug = new Imperiphor();
        System.out.println("new Imperaphor!");
      }



	    while( smaug.isAlive() && pat.isAlive() ) {

        // Give user the option of using a special attack:
        // If you land a hit, you incur greater damage,
        // ...but if you get hit, you take more damage.
        try {
          System.out.println( "\nDo you feel brave today, intrepid adventurer?" );
          System.out.println( "\t1: Nope, not today.");
          System.out.println("\t2: Most definitely I do! \n\t3: OH GOODNESS I'M SCARED LET ME DODGE");
          i = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) { }

        if ( i == 2 )
          pat.specialize();

        if (i==3)
          pat.dodge();
        else
          pat.normalize();

        d1 = pat.attack( smaug );
        d2 = smaug.attack( pat );


        System.out.println( "\n" + pat.getName() + " dealt " + d1 +" points of damage.");

        System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +" for " + d2 + " points of damage.");


        System.out.println("\n" + pat.getName() + " is at " + pat._hitPts + " health.");
        System.out.println("\n The monster is at " + smaug._hitPts + " health.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
        System.out.println( "'Twas an epic battle, to be sure... " +
                            "You cut ye olde monster down, but " +
                            "with its dying breath ye olde monster. " +
                            "laid a fatal blow upon thy skull." );
        return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
        System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
        return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
        System.out.println( "Ye olde self hath expired. You got dead." );
        return false;
	    }
    }//end else

    return true;
  }//end playTurn()
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main( String[] args ) {


    //As usual, move the begin-comment bar down as you progressively
    //test each new bit of functionality...

    //loading...
    YoRPG game = new YoRPG();
    int encounters = 0;
    while( encounters < MAX_ENCOUNTERS ) {
    if ( !game.playTurn() )
    break;
    encounters++;
    System.out.println();
    }
    System.out.println( "Thy game doth be over." );
	  /*================================================
	  ================================================*/
  }//end main

}//end class YoRPG
