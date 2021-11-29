# YoRPG_3LuckyDuckies
#### TNPG: 3 Lucky Duckies
####  Roster: Ziying Jian, Nora Miller, Gloria Lee

 v0 to v1 Changes: 
 * After using care package found in library, achieved compilability on YoRPG.java, Character.java, Protagonist.java and Monster.java. 
 * Modified Protagonist.java and Monster.java to be subclasses on Character.java
 * Added methods isAlive, getDefense, lowerHP, and attack to Character.java.
 
 v1 to v2 changes:
 * Created subclasses of Protagonist: Bruiser, Tank, and Mage
 * Created subclasses of Monster: Salvisanguin, Imperiphor, Cambrilevar
 * Cleaned up all Protagonist/Monster subclasses so that their code does not override methods/instance vars originally declared in Protagonist/Monster/Character.java
 * Created about methods for all subclasses.

v2 to v3 changes:
* Players can now choose a protagonist subclass to play as 
* Implemented a RNG function so that all three monster subclasses have equal chance of being encountered.
* Adjusted stats for all subclasses for more balanced gameplay.

v3 to v4 changes:
* Before choosing a Protagonist subclass, players have the option to view about descriptions for all Protagonist subclasses.
* Edited about descriptions so that they print out all atk/def/hp/etc. stats too
* Added safeguard measures so that when users choose difficulty >3 or try to choose a Protagonist subclass unavailable, users are prompted to input an input that is valid.
* Added to the about fxns so that they also display Protagonist subclass stats now.

v4 to v5 changes:
* Protagonists have the new option to dodge, taking 0 damage and dealing 0 damage, but they lose 10 health every time they dodge for being a coward.
* Monsters now have a 1 out of 3 chance of unlocking a brief powerup, where their damage is multiplied by 3. You can test your luck by seeing if you can dodge a powerup attack.
* Salvisanguins heal 10 health each round.

TO DO LIST FOR US!!
- DISCO / QCC
- REPLACE CURRENT FILES TO THE V3 FILES
- TIME SPENT
- PLEASE CHANGE MONSTER STATS TO BALANCE THEM
