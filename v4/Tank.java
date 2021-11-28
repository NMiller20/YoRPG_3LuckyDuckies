public class Tank extends Protagonist{


    /**
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      **/
    public Tank() {
      _name = "Tank";
        _hitPts = 200;
        _strength = 75;
        _defense = 60;
        _attackRating = 1;
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



    //prepare a Protagonist for a special attack
    public void specialize() {
        _attackRating = 2;
        _defense = 65;
    }


    //revert to normal mode
    public void normalize() {
        _attackRating = 1;
        _defense = 80;
    }

    public static String about(){
        String s = "ABOUT:";
        s += "\nTanks are perfect for the front line. ";
        s += "\nTanks are purposed for sustaining large damage amounts, but this is at the price of low strength.";
        s += "\nTanks have vastly higher health points and defense stats";
      /*  s += "\n\tHEALTH:" + Tank._hitPts;
        s += "\n\tSTRENGTH:" + Tank._strength;
        s += "\n\tDEFENSE:" + Tank._defense;
        s += "\n\tATTACK RATING:" + Tank._attackRating;
      */ return s;
    }
    public static void main(String[] args) {
        System.out.println(about());
    }//end main

}//end class Protagonist
