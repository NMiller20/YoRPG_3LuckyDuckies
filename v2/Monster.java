
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


  }//end class Monster
