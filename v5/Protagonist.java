public class Protagonist extends Character{

  protected String _name = "J. Doe";

    /**
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      **/
    public Protagonist() {
        _hitPts = 500;
        _strength = 50;
        _defense = 20;
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
        _defense = 5;
    }


    //revert to normal mode
    public void normalize() {
        _attackRating = 1;
        _defense = 20;
    }

    //dodge will allow you to deal no damage and take no damage from monsters
    //if you're lucky, you can dodge special attacks from monsters through dodging
    // but at the price of losing 10 health for each dodge for being a coward.
    public void dodge(){
      _defense =100000;
      _attackRating =0;
      _hitPts -= 10;
    }

}//end class Protagonist
