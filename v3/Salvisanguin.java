public class Salvisanguin extends Monster {

  public static String about(){
      String s = "ABOUT:";
      s += "\nResembling a vermillion penguin, the Salvisanguin is an annoying little monster to deal with.";
      s += "\nBy concentrating its life force to a special place inside of it, then circulating parts of it, ";
      s += "\nit is able to generate a large number of total health points at the cost of a significantly decreased attack stat.";
      s += "\nBecause its favorite food is fish, its presence can generally ";
      s += "\nbe smelled by those around it. ";
     return s;
  }
  public Salvisanguin() {
    _hitPts = 1000;
    _strength = 1 + (int)( Math.random() * 3 ); // [1,2)
    _defense = 20;
    _attackRating = 0.2;
  }

  public static void main(String[] args) {
      System.out.println(about());
    }//end main

  // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~

  }//end class Monster
