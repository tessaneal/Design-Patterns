package decorator;

/**
 * A flavor of ice cream (strawberry) that can be ordered
 * @author Tessa Neal
 */
public class Strawberry extends ScoopDecorator {
    
    /**
     * Creates a specified number of strawberry scoops
     * @param iceCream The ice cream that the shop has started
     * @param numScoops The number of scoops that was ordered
     */
    public Strawberry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "strawberry";
        this.flavorCost = (1.4*numScoops);
    }
}
