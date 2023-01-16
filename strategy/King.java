package strategy;

/**
 * A Type of Video Game Character Known as a King
 * @author Tessa Neal
 * 
 */
public class King extends Character {

    /**
     * Creates a new king with the indicated name
     * @param name The name of the king
     */
    public King(String name) {
        super(name);
        WeaponBehavior temp = new WeaponSword();
        setWeaponBehavior(temp);
    }

    /**
     * Describes the king and gives his name
     * @return A string representation of the king
     */
    public String toString() {
        return name+" is a Noble King";
    }
}