public class Imperiphor extends Monster {

public static String about(){
        String s = "ABOUT:";
        s += "\nRoughly twice the size of a bear, the Imperiphor is a menace to any warrior who fights" ;
        s += "\nfrom a medium or long distance, due to the difficulty of penetrating its scaly, metallic ";
        s += "\nexterior. It is believed to be native to Staten Island, and insists, to anyone who will ";
        s += "\nlisten, that its homeland is the most important part of New York City.";
        return s;
    }

    public static void main(String[] args) {
        System.out.println(about());
    }//end main

    public Imperiphor() {
	_hitPts = 150;
      _strength = 20 + (int)( Math.random() * 45 ); // [20,65)
      _defense = 20;
      _attackRating = 1;
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~

  }//end class
