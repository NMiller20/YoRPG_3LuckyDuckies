public class Protagonist extends Character{

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private String _name = "J. Doe";
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
    public Protagonist() {
        _hitPts = 125;
        _strength = 100;
        _defense = 40;
        _attack = .4;
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
        _attack = .75;
        _defense = 20;
    }


    //revert to normal mode
    public void normalize() {
        _attack = .4;
        _defense = 40;
    }

}//end class Protagonist
