package strategy;

import java.util.Random;

/**
 * The Behavior for a Character that Attacks with an Axe
 * @author Tessa Neal
 * 
 */
public class WeaponAxe implements WeaponBehavior {

    Random r = new Random();

    /**
     * Describes how the charater attacks with an axe
     * @return A string representation of the axe attack
     */
    public String attack() {
        String phrase;
        int randomNumber = r.nextInt(2);
        if(randomNumber == 0) {
            phrase = "Swing an axe";
        }
        else {
            phrase = "Twirl with an axe";
        }
        return phrase;
    }
}