public class Monster extends Character {
public int roll;

    /**
     default constructor
     pre:  instance vars are declared
     post: initializes instance vars.
     **/
    public Monster() {
        _hitPts = 400;
        _strength = 75 + (int)( Math.random() * 75 ); // [75,150)
        _defense = 15;
        _attackRating = 1;
    }

    public String toString(){
        return "";
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public int attack( Character opponent ) {
        roll = (int)(Math.random()*3);
        int damage = (int)( (_strength * _attackRating) - opponent.getDefense() );
        if(roll == 2){
            System.out.println("\t\tOUCH! You got unlucky! Ye Olde Monster unlocked a brief powerup.");
            damage = damage * 3;
        }else if (roll == 1){
          System.out.println("\t\tLucky you! Ye Olde Monster missed, so you took 0 damage");
          damage = 0;
        }

        //System.out.println( "\t\t**DIAG** damage: " + damage );

        if ( damage < 0 )
            damage = 0;

        opponent.lowerHP( damage );

        return damage;
    }//end attack


}//end class Monster
