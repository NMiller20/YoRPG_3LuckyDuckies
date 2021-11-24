
  public class Monster extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private int _hitPts;
    private int _strength;
    private int _defense;
    private double _attack;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /**
       default constructor
       pre:  instance vars are declared
       post: initializes instance vars.
    **/
    public Monster() {
      _hitPts = 185;
      _strength = 30 + (int)( Math.random() * 45 ); // [20,65)
      _defense = 40;
      _attack = 10;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~


  }//end class Monster
