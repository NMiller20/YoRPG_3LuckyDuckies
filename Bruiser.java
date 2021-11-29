public class Bruiser extends Protagonist{



    /**
     default constructor
     pre:  instance vars are declared
     post: initializes instance vars.
     **/
    public Bruiser() {
        _name = "Bruiser";
        _hitPts = 1200;
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
        Protagonist test = new Bruiser();
        String s = "ABOUT:";
        s += "\n* Bruisers are built for close combat!";
        s += "\n* Bruisers have higher total health points as well as higher strength and defense, but not as high as mages";
        s += "\nor tanks which are specialized! Bruisers are well rounded fighters, fit for those who seek to eradicate " +
                "\neverything in their way.\n";
        s += "\n\t========STATS=======";
        s += "\n\t* HEALTH: " + test._hitPts ;
        s += "\n\t* STRENGTH: " + test._strength ;
        s += "\n\t* DEFENSE: " + test._defense ;
        s += "\n\t* ATTACK RATING: " + test._attackRating ;
        s += "\n\t====================";
        return s;
    }
    public static void main(String[] args) {
        System.out.println(about());
    }//end main

}//end class Protagonist