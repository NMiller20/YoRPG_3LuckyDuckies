public class Imperiphor extends Monster {

public static String about(){
        Monster test = new Imperiphor();
        String s = "ABOUT:";
        s += "\nRoughly twice the size of a bear, the Imperiphor is a menace to any warrior who fights" ;
        s += "\nfrom a medium or long distance, due to the difficulty of penetrating its scaly, metallic ";
        s += "\nexterior. It is believed to be native to Staten Island, and insists, to anyone who will ";
        s += "\nlisten, that its homeland is the most important part of New York City.";
        s += "\n\tHEALTH:" + test._hitPts;
        s += "\n\tSTRENGTH:" + test._strength;
        s += "\n\tDEFENSE:" + test._defense;
        s += "\n\tATTACK RATING:" + test._attackRating;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(about());
    }//end main

    public Imperiphor() {
	_hitPts = 400;
      _strength = 50 + (int)( Math.random() * 50 ); // [50,100)
      _defense = 50;
      _attackRating = 1;
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~

  }//end class
