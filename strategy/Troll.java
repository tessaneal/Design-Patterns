package strategy;

/**
 * A Type of Video Game Character Known as a Troll
 * @author Tessa Neal
 * 
 */
public class Troll extends Character {

    /**
     * Creates a new troll with the indicated name
     * @param name The name of the troll
     */
    public Troll(String name) {
        super(name);
        WeaponBehavior temp = new WeaponAxe();
        setWeaponBehavior(temp);
    }

    /**
     * Describes the troll and gives its name
     * @return A string representation of the troll
     */
    public String toString() {
        return name+" is a funny troll";
    }
}