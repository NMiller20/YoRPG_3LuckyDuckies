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
        _defense = 45;
    }


    //revert to normal mode
    public void normalize() {
        _attackRating = 1;
        _defense = 60;
    }

    public static String about(){
        String s = "ABOUT:";
        s += "\nTanks are perfect for the front line. ";
        s += "\nTanks are purposed for sustaining large damage amounts, but this is at the price of low strength.";
        s += "\nTanks have vastly higher health points and defense stats";
       return s;
    }
    public static void main(String[] args) {
        System.out.println(about());
    }//end main

}//end class Protagonist
