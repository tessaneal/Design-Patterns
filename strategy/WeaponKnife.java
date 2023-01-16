package strategy;

import java.util.Random;

/**
 * The Behavior for a Character that Attacks with a Knife
 * @author Tessa Neal
 * 
 */
public class WeaponKnife implements WeaponBehavior {

    Random r = new Random();

    /**
     * Describes how the charater attacks with a knife
     * @return A string representation of the knife attack
     */
    public String attack() {
        String phrase;
        int randomNumber = r.nextInt(3);
        if(randomNumber == 0) {
            phrase = "Slice with knife";
        } else if (randomNumber == 1){
            phrase = "Jab with a knife";
        } else {
            phrase = "Sneak up on opponent with knife";
        }
        return phrase;
    }
}