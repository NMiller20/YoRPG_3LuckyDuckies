
  public class Monster extends Character {

    /**
       default constructor
       pre:  instance vars are declared
       post: initializes instance vars.
    **/
    public Monster() {
      _hitPts = 200;
      _strength = 60 + (int)( Math.random() * 10 ); // [60,70)
      _defense = 20;
      _attackRating = 1;
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
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

      return damage;
    }//end attack

  }//end class Monster
