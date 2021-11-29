# YoRPG_3LuckyDuckies
#### TNPG: 3 Lucky Duckies
####  Roster: Ziying Jian, Nora Miller, Gloria Lee

## Protagonist Subclasses:
### Bruiser:  
#### Bruisers are built for close combat!
Bruisers have higher total health points as well as higher strength and defense, but not as high as mages
or tanks which are specialized! Bruisers are well rounded fighters with no one area that they excel at.
* HEALTH: 1200
* STRENGTH: 175
* DEFENSE: 25
* ATTACK RATING: 1.0

### Tank:
#### Tanks are perfect for the front line!
Tanks are purposed for sustaining large damage amounts, but this is at the price of low strength.
Tanks have vastly higher health points and defense stats
* HEALTH: 1400
* STRENGTH: 150
* DEFENSE: 30
* ATTACK RATING: 1.0

### Mage:
#### Mages are perfect for long range combat!
Mages use a variety of elemental magic to attack their enemies from long ranges.
They have vastly increased strength, but as a result, mages suffer from low health and low defense.
* HEALTH: 800
* STRENGTH: 250
* DEFENSE: 10
* ATTACK RATING: 1.0

## Monster Subclasses:
### Cambrilevar:  
The Cambrilevar has the unique ability to transform itself from any form into an arrow, its preferred form.
As an arrow, it can achieve speeds above the speed of sound,
allowing it to attack those around it in a terrifying and seemingly random fashion, but at great risk to itself.
* HEALTH: 350
* STRENGTH: [75, 150)
* DEFENSE: 20
* ATTACK RATING: 1.0


### Imperiphor:
Roughly twice the size of a bear, the Imperiphor is a menace to any warrior who fights
from a medium or long distance, due to the difficulty of penetrating its scaly, metallic
exterior. It is believed to be native to Staten Island, and insists, to anyone who will
listen, that its homeland is the most important part of New York City.
* HEALTH: 400
* STRENGTH: [50, 100)
* DEFENSE: 30
* ATTACK RATING: 1.0

### Salvisanguin:
Resembling a vermillion penguin, the Salvisanguin is an annoying little monster to deal with.
By concentrating its life force to a special place inside of it, then circulating parts of it,
it is able to generate a large number of total health points at the cost of a significantly decreased attack stat.
This monster heals for a small amount each round."
* HEALTH: 500
* STRENGTH: [100,125)
* DEFENSE: 10
* ATTACK RATING: 1.0
---

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
* Monsters now have a 1 out of 10 chance of unlocking a brief powerup, where their damage is multiplied by 3. You can test your luck by seeing if you can dodge a powerup attack.
* Salvisanguins heal 10 health each round.
* Modified subclass stats for more balanced gameplay.

v5 to v6 changes:
* Fixed some formatting issues with the text and whatnot
* Specified monster names in encounter and battle messages
* Created a mechanism that allows the player to type YES after reading ABOUT to generate the selection chart as opposed to the selection chart being generated in tandem. This prevents the user from having to scroll up <3
* Added a natural built in dodging rng mechanism, where both monsters and protagonists have a 1/10 chance of taking no damage for a round while still dealing damage.
* Added passives for each monster subclass so that after each round, each monster subclass has a special passive characteristic. Salvisanguins heal, Cambrilevars lose health from self destruction, and Imperiphors gain defense.

---
#### Ways to Grow our Game:
* Create ultimate methods for protagonist Subclasses
* Create a levelling system where the protagonist can increase stats after defeating enough monsters
* Create a mana system where it costs mana to cast a specialized attack
* Add more monsters and protagonist subclasses!
