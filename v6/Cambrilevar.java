public class Cambrilevar extends Monster {

    public static String about(){
        Monster test = new Cambrilevar();
        String s = "ABOUT:";
        s += "\nThe Cambrilevar has the unique ability to transform itself from any form into an arrow, its preferred form.";
        s += "\nAs an arrow, it can achieve speeds above the speed of sound, ";
        s += "\nallowing it to attack those around it in a terrifying and seemingly random fashion, but at great risk to itself.";
        s += "\n\tHEALTH:" + test._hitPts;
        s += "\n\tSTRENGTH:[75, 150)" ;
        s += "\n\tDEFENSE:" + test._defense;
        s += "\n\tATTACK RATING:" + test._attackRating;
        return s;
    }


    public String toString(){
        return "Cambrilevar";
    }

    public static void main(String[] args) {
        System.out.println(about());
    }//end main

    public Cambrilevar() {
        _hitPts = 350;
        _strength = 75 + (int)( Math.random() * 150); // [3, 51)
        _defense = 20;
        _attackRating = 1;
    }
}

// ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~


//end class Cambrilevar