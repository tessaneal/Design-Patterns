package decorator;

/**
 * A decorator that can add scoops of different flavors to the ice cream that was ordered
 * @author Tessa Neal
 */
public abstract class ScoopDecorator extends IceCream {

    protected IceCream iceCream;
    protected int numScoops;
    protected String flavor;
    protected double flavorCost;

    /**
     * Creates a new ScoopDecorator to make the ice cream that was ordered
     * @param iceCream The ice cream that the shop has started
     * @param numScoops The number of scoops that was ordered
     */
    public ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numScoops = numScoops;
    }

    /**
     * Describes the ice cream that was ordered after the scoops have been added
     * @return A string representation of the ice cream and its individual scoops
     */
    public String toString() {
        if(numScoops == 1) {
            return iceCream.toString() + ", a scoop of "+flavor+" ice cream";
        } else {
            return iceCream.toString() + ", "+numScoops+" scoops of "+flavor+" ice cream";
        }
    }

    /**
     * Describes how much the ice cream costs after the scoops have been added
     * @return A double representation of the cost of the ice cream after the scoops have been added
     */
    public double getCost() {
        return iceCream.getCost() + flavorCost;
    }
    
}
