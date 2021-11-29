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
        _attackRating = 1.6;
        _defense = 65;
    }


    //revert to normal mode
    public void normalize() {
        _attackRating = 1;
        _defense = 80;
    }

    public static String about(){
        Protagonist test = new Tank();
        String s = "ABOUT:";
        s += "\n* Tanks are perfect for the front line. ";
        s += "\n* Tanks are purposed for sustaining large damage amounts, but this is at the price of low strength.";
        s += "\n* Tanks have vastly higher health points and defense stats.\n";
        s += "\n\t=======STATS=======";
        s += "\n\t* HEALTH: " + test._hitPts;
        s += "\n\t* STRENGTH: " + test._strength;
        s += "\n\t* DEFENSE: " + test._defense;
        s += "\n\t* ATTACK RATING: " + test._attackRating;
        s += "\n\t===================";
        return s;
    }
    public static void main(String[] args) {
        System.out.println(about());
    }//end main

}//end class Protagonist