public class Salvisanguin extends Monster {

  public static String about(){
      Monster test = new Salvisanguin();
      String s = "ABOUT:";
      s += "\nResembling a vermillion penguin, the Salvisanguin is an annoying little monster to deal with.";
      s += "\nBy concentrating its life force to a special place inside of it, then circulating parts of it, ";
      s += "\nit is able to generate a large number of total health points at the cost of a significantly decreased attack stat.";
      s += "\nThis monster heals for a small amount each round.";
      s += "\n\tHEALTH:" + test._hitPts;
      s += "\n\tSTRENGTH:" + test._strength;
      s += "\n\tDEFENSE:" + test._defense;
      s += "\n\tATTACK RATING:" + test._attackRating;
     return s;
  }
  public Salvisanguin() {
    _hitPts = 1000;
    _strength = 1 + (int)( Math.random() * 3 ); // [1,2)
    _defense = 20;
    _attackRating = 0.2;
  }

  public int attack( Character opponent ) {
    int roll = 0;
    roll = (int)(Math.random()*3);
    int damage = (int)( (_strength * _attackRating) - opponent.getDefense() );
    if(roll == 2){
      System.out.println("\t\tOUCH! You got unlucky! Ye Olde Monster unlocked a brief powerup.");
      damage = damage * 3;
    }

    //System.out.println( "\t\t**DIAG** damage: " + damage );

    if ( damage < 0 )
      damage = 0;

    opponent.lowerHP( damage );
    this();
    heal(10);
    return damage;
  }//end attack

  public static void main(String[] args) {
      System.out.println(about());
    }//end main

  // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~

  }//end class Monster
