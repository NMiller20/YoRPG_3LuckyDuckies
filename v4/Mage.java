public class Mage extends Protagonist{



    /**
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      **/
    public Mage() {
      _name = "Mage";
        _hitPts = 100;
        _strength = 175;
        _defense = 20;
        _attackRating = 1;
    }


    /**
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      **/
    public Mage( String name ) {
        this();
        _name = name;
    }



    //prepare a Protagonist for a special attack
    public void specialize() {
        _attackRating = 3;
        _defense = 10;
    }


    //revert to normal mode
    public void normalize() {
        _attackRating = 1;
        _defense = 20;
    }

    public static String about(){
        Protagonist test = new Mage();
        String s = "ABOUT:";
        s += "\n\tMages are perfect for long range combat!";
        s += "\n\tThey have vastly increased strength, but as a result, mages suffer from low health and low defense. ";
        s += "\n\tHEALTH:" + test._hitPts;
        s += "\n\tSTRENGTH:" + test._strength;
        s += "\n\tDEFENSE:" + test._defense;
        s += "\n\tATTACK RATING:" + test._attackRating;
      return s;
    }
    public static void main(String[] args) {
        System.out.println(about());
    }//end main

}//end class Protagonist
