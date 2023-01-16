package strategy;

/**
 * A Video Game Character in a Royal Court
 * @author Tessa Neal
 * 
 */
public abstract class Character{
    
    protected String name;
    WeaponBehavior weaponBehavior;

    /**
     * Creates a new character with the indicated name
     * @param name The name of the character
     */
    public Character(String name) {
        this.name = name;
    }

    /**
     * Describes how the charater attacks
     * @return A string representation of the attack
     */
    public String attack() {
        return weaponBehavior.attack();
    }

    /**
     * Assigns the indicated weapon behavior to the character
     * @param wb The WeaponBehavior that the Character will have
     */
    public void setWeaponBehavior(WeaponBehavior wb) {
        this.weaponBehavior = wb;
    }

    /**
     * Describes the character and gives its name
     * @return A string representation of the character
     */
    public abstract String toString();
    
}