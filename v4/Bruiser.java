public class Bruiser extends Protagonist{



    /**
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      **/
    public Bruiser() {
      _name = "Bruiser";
        _hitPts = 150;
        _strength = 125;
        _defense = 25;
        _attackRating = .4;
    }


    /**
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      **/
    public Bruiser( String name ) {
        this();
        _name = name;
    }


    //prepare a Protagonist for a special attack
    public void specialize() {
        _attackRating = .75;
        _defense = 15;
    }


    //revert to normal mode
    public void normalize() {
        _attackRating = .4;
        _defense = 25;
    }

    public static String about(){
        String s = "ABOUT:";
        s += "\n\tBruisers are built for close combat!";
        s += "\n\tBruisers have higher total health points as well as higher strength and defense, but not as high as mages or tanks which are specialized!";
        s += "\n\tBruisers are well rounded fighters but don't have an especially high stat.";
        /*s += "\n\tHEALTH:" + Bruiser._hitPts;
        s += "\n\tSTRENGTH:" + Bruiser._strength;
        s += "\n\tDEFENSE:" + Bruiser._defense;
        s += "\n\tATTACK RATING:" + Bruiser._attackRating;
       */return s;
    }
    public static void main(String[] args) {
        System.out.println(about());
    }//end main

}//end class Protagonist
