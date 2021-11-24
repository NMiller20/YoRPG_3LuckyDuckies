
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
      _hitPts = 99999;
      _strength = 50 + (int)( Math.random() * 45 ); // [20,95)
      _defense = 100;
      _attack = 30;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~


  }//end class Monster
