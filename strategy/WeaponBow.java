package strategy;

import java.util.Random;

/**
 * The Behavior for a Character that Attacks with a Bow
 * @author Tessa Neal
 * 
 */
public class WeaponBow implements WeaponBehavior {

    Random r = new Random();

    /**
     * Describes how the charater attacks with a bow
     * @return A string representation of the bow attack
     */
    public String attack() {
        String phrase;
        int randomNumber = r.nextInt(2);
        if(randomNumber == 0) {
            phrase = "Draw and loose an arrow";
        }
        else {
            phrase = "Shoot arrow high in the sky";
        }
        return phrase;
    }
}