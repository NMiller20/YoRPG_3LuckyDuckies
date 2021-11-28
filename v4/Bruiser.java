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
      Protagonist pat = new Bruiser();
        String s = "ABOUT:";
        s += "\n\tBruisers are built for close combat!";
        s += "\n\tBruisers have higher total health points as well as higher strength and defense, but not as high as mages";
        s += "\n\t or tanks which are specialized! Bruisers are well rounded fighters but don't have an especially high stat.";
        s += "\n\tHEALTH:" + pat._hitPts;
        s += "\n\tSTRENGTH:" + pat._strength;
        s += "\n\tDEFENSE:" + pat._defense;
        s += "\n\tATTACK RATING:" + pat._attackRating;
       return s;
    }
    public static void main(String[] args) {
        System.out.println(about());
    }//end main

}//end class Protagonist
