package strategy;

import java.util.Random;

/**
 * The Behavior for a Character that Attacks with Nothing
 * @author Tessa Neal
 * 
 */
public class WeaponNone implements WeaponBehavior {

    Random r = new Random();

    /**
     * Describes how the charater attacks with nothing
     * @return A string representation of the attack with no weapon
     */
    public String attack() {
        String phrase;
        int randomNumber = r.nextInt(2);
        if(randomNumber == 0) {
            phrase = "Oh no! I lost my weapon";
        }
        else {
            phrase = "No one let's me have a weapon";
        }
        return phrase;
    }
}