package decorator;

/**
 * An item that can be ordered at the ice cream shop
 * @author Tessa Neal
 */
public abstract class IceCream {
    protected String description;

    /**
     * Describes the ice cream that was ordered
     * @return A string representation of the ice cream that was ordered
     */
    public String toString() {
        return description;
    }

    /**
     * Describes how much the ice cream costs
     * @return A double representation of the cost of the ice cream
     */
    public abstract double getCost();
}
