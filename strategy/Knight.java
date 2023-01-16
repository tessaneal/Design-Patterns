package strategy;

/**
 * A Type of Video Game Character Known as a Knight
 * @author Tessa Neal
 * 
 */
public class Knight extends Character {

    /**
     * Creates a new knight with the indicated name
     * @param name The name of the knight
     */
    public Knight(String name) {
        super(name);
        WeaponBehavior temp = new WeaponBow();
        setWeaponBehavior(temp);
    }

    /**
     * Describes the knight and gives their name
     * @return A string representation of the knight
     */
    public String toString() {
        return name+" is a valiant knight";
    }
}