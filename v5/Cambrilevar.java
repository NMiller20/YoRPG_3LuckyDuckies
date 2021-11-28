public class Cambrilevar extends Monster {

    public static String about(){
      Monster test = new Cambrilevar();
        String s = "ABOUT:";
        s += "\nThe Cambrilevar has the unique ability to transform itself from any form into an arrow, its preferred form.";
        s += "\nAs an arrow, it can achieve speeds above the speed of sound, ";
        s += "\nallowing it to attack those around it in a terrifying and seemingly random fashion, but at great risk to itself.";
        s += "\n\tHEALTH:" + test._hitPts;
        s += "\n\tSTRENGTH:" + test._strength;
        s += "\n\tDEFENSE:" + test._defense;
        s += "\n\tATTACK RATING:" + test._attackRating;
       return s;
    }

    public static void main(String[] args) {
        System.out.println(about());
    }//end main

    public Cambrilevar() {
	_hitPts = 325;
	_strength = 3 + (int)( Math.random() * 41); // [3, 44)
	_defense = 35;
	_attackRating = .6;
     }
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~


  //end class Cambrilevar
