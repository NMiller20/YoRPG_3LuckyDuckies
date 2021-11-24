
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
      _hitPts = 185;
      _strength = 30 + (int)( Math.random() * 45 ); // [20,65)
      _defense = 40;
      _attack = 10;
    }

    public static String about(){
        String s = "ABOUT:";
        s += "\nThe Cambrilevar has the unique ability to transform itself from any form into an arrow, its preferred form.";
        s += "\nAs an arrow, it can achieve speeds above the speed of sound, ";
        s += "\nallowing it to attack those around it in a terrifying and seemingly random fashion, but at great risk to itself.";
       return s;
    }

    public static void main(String[] args) {
        System.out.println(about());
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~


  }//end class Monster
