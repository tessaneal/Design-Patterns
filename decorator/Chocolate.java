package decorator;

/**
 * A flavor of ice cream (chocolate) that can be ordered
 * @author Tessa Neal
 */
public class Chocolate extends ScoopDecorator {
    
    /**
     * Creates a specified number of chocolate scoops
     * @param iceCream The ice cream that the shop has started
     * @param numScoops The number of scoops that was ordered
     */
    public Chocolate(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "chocolate";
        this.flavorCost = (1.5*numScoops);
    }
}
