public class Character {
  public int _hitPts; // same as health
  public int _strength;
  public int _defense;
  public double _attackRating;




  public boolean isAlive() {
    return _hitPts > 0;
  }


  public int getDefense(){
    return _defense;
  }


  public void lowerHP(int damageTaken){
    _hitPts -= damageTaken;
  }


  public int attack( Character opponent ) {

    int damage = (int)( (_strength * _attackRating) - opponent.getDefense() );
    //System.out.println( "\t\t**DIAG** damage: " + damage );

    if ( damage < 0 )
      damage = 0;

    opponent.lowerHP( damage );

    return damage;
  }//end attack

}


/*
String nombre; // an instance variable for the protagonist's name
boolean isAlive;

public Character() {
}

public Character(String name) {
  this();
  nombre = name;
}
*/
