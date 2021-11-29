public class Imperiphor extends Monster {

    public static String about(){
        Monster test = new Cambrilevar();
        String s = "ABOUT:";
        s += "\nRoughly twice the size of a bear, the Imperiphor is a menace to any warrior who fights" ;
        s += "\nfrom a medium or long distance, due to the difficulty of penetrating its scaly, metallic ";
        s += "\nexterior. It is believed to be native to Staten Island, and insists, to anyone who will ";
        s += "\nlisten, that its homeland is the most important part of New York City.";
        s += "\n\tHEALTH:" + test._hitPts;
        s += "\n\tSTRENGTH:[50,100)" ;
        s += "\n\tDEFENSE:" + test._defense;
        s += "\n\tATTACK RATING:" + test._attackRating;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(about());
    }//end main

    public String toString(){
        return "Imperiphor";
    }

    public Imperiphor() {
        _hitPts = 400;
        _strength = 50 + (int)( Math.random() * 50 ); // [50,100)
        _defense = 30;
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
      _defense += 5;
      return damage;

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~

}//end class
