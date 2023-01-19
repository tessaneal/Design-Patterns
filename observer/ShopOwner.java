package observer;

/**
 * A type of observer known as a shop owner that reacts when a warning is given
 * @author Tessa Neal
 * 
 */
public class ShopOwner implements Observer{
    
    private Subject watchman;

    /**
     * Creates a new shop owner that observes a watchman
     * @param watchman The watchman that the shop owner will observe
     */
    public ShopOwner(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    /**
     * Prints the action of the shop owner after a warning is issued
     * @param warning The number of the warning that was issued
     */
    public void update(int warning) {
        if(warning == 1) {
            System.out.println("Shop Owner: Close down shop and head home");
        }
        else if(warning == 2) {
            System.out.println("Shop Owner: Drops everything and find nearest hideout");
        }
    }
}
