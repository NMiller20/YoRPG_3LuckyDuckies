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
        _attackRating = .4;
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
        _attackRating = .75;
        _defense = 20;
    }


    //revert to normal mode
    public void normalize() {
        _attackRating = .4;
        _defense = 40;
    }

}//end class Protagonist
