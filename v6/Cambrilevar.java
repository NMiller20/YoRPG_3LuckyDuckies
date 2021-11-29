public class Cambrilevar extends Monster {

    public static String about(){
        String s = "ABOUT:";
        s += "\nThe Cambrilevar has the unique ability to transform itself from any form into an arrow, its preferred form.";
        s += "\nAs an arrow, it can achieve speeds above the speed of sound, ";
        s += "\nallowing it to attack those around it in a terrifying and seemingly random fashion, but at great risk to itself.";
        return s;
    }


    public String toString(){
        return "Cambrilevar";
    }

    public static void main(String[] args) {
        System.out.println(about());
    }//end main

    public Cambrilevar() {
        _hitPts = 325;
        _strength = 15 + (int)( Math.random() * 51); // [3, 51)
        _defense = 35;
        _attackRating = 1;
    }
}

// ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~


//end class Cambrilevar