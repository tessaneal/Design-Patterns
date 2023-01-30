package decorator;

/**
 * A type of container (bowl) that the ice cream can be put in
 * @author Tessa Neal
 */
public class Bowl extends IceCream {
    
    /**
     * Creates a new bowl
     */
    public Bowl() {
        this.description = "Bowl";
    }

    /**
     * Describes how much the ice cream costs in a bowl
     * @return A double representation of the cost of the bowl
     */
    public double getCost() {
        return 0;
    }

}
