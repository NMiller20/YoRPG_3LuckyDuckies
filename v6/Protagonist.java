public class Protagonist extends Character{

    protected String _name = "J. Doe";

    /**
     default constructor
     pre:  instance vars are declared
     post: initializes instance vars.
     **/
    public Protagonist() {
        _hitPts = 125;
        _strength = 100;
        _defense = 40;
        _attackRating = 1;
    }


    /**
     overloaded constructor
     pre:  instance vars are declared
     post: initializes instance vars. _name is set to input String.
     **/
    public Protagonist( String name ) {
        this();
        _name = name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }


    //prepare a Protagonist for a special attack
    public void specialize() {
        _attackRating = 2;
        _defense = 20;
    }


    //revert to normal mode
    public void normalize() {
        _attackRating = 1;
        _defense = 40;
    }

    public int attack( Character opponent ) {

        int damage = (int)( (_strength * _attackRating) - opponent.getDefense() );
        if(Monster.roll == 0){
          System.out.println("\t\tOh no! Ye Olde Monster dodged, taking 0 damage.");
          damage = 0;
        }



        //System.out.println( "\t\t**DIAG** damage: " + damage );

        if ( damage < 0 )
            damage = 0;

        opponent.lowerHP( damage );

        return damage;
    }//end attack

    //dodge will allow you to deal no damage and take no damage from monsters
    //if you're lucky, you can dodge special attacks from monsters through dodging
    // but at the price of losing 10 health for each dodge for being a coward.
    public void dodge(){
        _defense =100000;
        _attackRating =0;
        _hitPts -= 10;
    }

}//end class Protagonist
