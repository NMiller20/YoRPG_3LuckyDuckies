
  public class Monster extends Character {

    /**
       default constructor
       pre:  instance vars are declared
       post: initializes instance vars.
    **/
    public Monster() {
      _hitPts = 150;
      _strength = 20 + (int)( Math.random() * 45 ); // [20,65)
      _defense = 20;
      _attack = 1;
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~


  }//end class Monster
