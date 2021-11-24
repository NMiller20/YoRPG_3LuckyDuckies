public class Tank extends Protagonist{


    /**
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      **/
    public Tank() {
      _name = "Tank";
        _hitPts = 250;
        _strength = 75;
        _defense = 80;
        _attackRating = .4;
    }


    /**
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      **/
    public Tank( String name ) {
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
