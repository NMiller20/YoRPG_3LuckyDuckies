
  public class Monster extends Character {

    /**
       default constructor
       pre:  instance vars are declared
       post: initializes instance vars.
    **/
    public Monster() {
      _hitPts = 200;
      _strength = 20 + (int)( Math.random() * 10 ); // [20,30)
      _defense = 20;
      _attackRating = 1;
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~


  }//end class Monster
