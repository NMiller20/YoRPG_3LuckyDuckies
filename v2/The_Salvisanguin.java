
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
      _hitPts = 99999;
      _strength = 50 + (int)( Math.random() * 45 ); // [20,95)
      _defense = 100;
      _attack = 30;
    }

public static String about(){
        String s = "ABOUT:";
        s += "\nResembling a vermillion penguin, the Salvisanguin heals itself after being wounded by concentrating";
        s += "\nits life force to a special place inside of it, then circulating parts of it ";
        s += "\nin the areas of its wounds. Because its favorite food is fish, its presence can generally ";
        s += "\nbe smelled by those around it. ";
       return s;
    }

    public static void main(String[] args) {
        System.out.println(about());

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~


  }//end class Monster
