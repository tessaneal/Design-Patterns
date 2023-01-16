package strategy;

/**
 * The Way a Character Should Attack with their Weapon
 * @author Tessa Neal
 * 
 */
public interface WeaponBehavior {
   
    /**
     * Describes how the charater attacks
     * @return A string representation of the attack
     */
    public String attack();
}