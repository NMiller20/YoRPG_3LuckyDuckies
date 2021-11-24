
  public class Monster extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private int _hitPts;
    private int _strength;
    private int _defense;
    private double _attack;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /**
       default constructor
       pre:  instance vars are declared
       post: initializes instance vars.
    **/
    public Monster() {
      _hitPts = 150;
      _strength = 20 + (int)( Math.random() * 45 ); // [20,65)
      _defense = 20;
      _attack = 1;
    }

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
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~


  }//end class Monster
