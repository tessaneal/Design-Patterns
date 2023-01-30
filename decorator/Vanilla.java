package decorator;

/**
 * A flavor of ice cream (vanilla) that can be ordered
 * @author Tessa Neal
 */
public class Vanilla extends ScoopDecorator {
    
    /**
     * Creates a specified number of vanilla scoops
     * @param iceCream The ice cream that the shop has started
     * @param numScoops The number of scoops that was ordered
     */
    public Vanilla(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);
        this.flavor = "vanilla";
        this.flavorCost = (1.25*numScoops);
    }
}
