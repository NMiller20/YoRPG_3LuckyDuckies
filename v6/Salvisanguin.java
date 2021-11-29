public class Salvisanguin extends Monster {

    public static String about(){
        Monster test = new Cambrilevar();
        String s = "ABOUT:";
        s += "\nResembling a vermillion penguin, the Salvisanguin is an annoying little monster to deal with.";
        s += "\nBy concentrating its life force to a special place inside of it, then circulating parts of it, ";
        s += "\nit is able to generate a large number of total health points at the cost of a significantly decreased attack stat.";
        s += "\nThis monster heals for a small amount each round.";
        s += "\nBecause its favorite food is fish, its presence can generally ";
        s += "\nbe smelled by those around it. ";
        s += "\n\tHEALTH:" + test._hitPts;
        s += "\n\tSTRENGTH:[100,125)";
        s += "\n\tDEFENSE:" + test._defense;
        s += "\n\tATTACK RATING:" + test._attackRating;
        return s;
    }
    public Salvisanguin() {
        _hitPts = 500;
        _strength = 100 + (int)( Math.random() * 25 ); // [100,125)
        _defense = 10;
        _attackRating = 1;
    }

    public int attack( Character opponent ) {
        roll = (int)(Math.random()*10);
        int damage = (int)( (_strength * _attackRating) - opponent.getDefense() );
        if(roll == 0){
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
      _hitPts += 50;
      return damage;
    }//end attack
    public String toString(){
        return "Salvisanguin";
    }

    public static void main(String[] args) {
        System.out.println(about());
    }//end main

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~

}//end class Monster
