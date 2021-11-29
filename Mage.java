public class Mage extends Protagonist{



    /**
     default constructor
     pre:  instance vars are declared
     post: initializes instance vars.
     **/
    public Mage() {
        _name = "Mage";
        _hitPts = 800;
        _strength = 250;
        _defense = 10;
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
        s += "\n* Mages are perfect for long range combat!";
        s += "\n* They have vastly increased strength, but as a result, mages suffer from low health and low defense.\n";
        s += "\n\t=======STATS========";
        s += "\n\t* HEALTH: " + test._hitPts;
        s += "\n\t* STRENGTH: " + test._strength;
        s += "\n\t* DEFENSE: " + test._defense;
        s += "\n\t* ATTACK RATING: " + test._attackRating;
        s += "\n\t====================";
        return s;
    }
    public static void main(String[] args) {
        System.out.println(about());
    }//end main

}//end class Protagonist
