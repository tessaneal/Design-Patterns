package strategy;

import java.util.Random;

/**
 * The Behavior for a Character that Attacks with a Sword
 * @author Tessa Neal
 * 
 */
public class WeaponSword implements WeaponBehavior {

    Random r = new Random();

    /**
     * Describes how the charater attacks with a sword
     * @return A string representation of the sword attack
     */
    public String attack() {
        String phrase;
        int randomNumber = r.nextInt(3);
        if(randomNumber == 0) {
            phrase = "Lunge and strike with sword";
        } else if (randomNumber == 1){
            phrase = "Fancy turn and slice with sword";
        } else {
            phrase = "Jam opponents blade with sword";
        }
        return phrase;
    }
}