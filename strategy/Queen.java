package strategy;

/**
 * A Type of Video Game Character Known as a Queen
 * @author Tessa Neal
 * 
 */
public class Queen extends Character {

    /**
     * Creates a new queen with the indicated name
     * @param name The name of the queen
     */
    public Queen(String name) {
        super(name);
        WeaponBehavior temp = new WeaponKnife();
        setWeaponBehavior(temp);
    }

    /**
     * Describes the queen and gives her name
     * @return A string representation of the queen
     */
    public String toString() {
        return name+" is a beautiful queen";
    }
}