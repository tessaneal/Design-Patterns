package observer;

/**
 * A type of observer known as a knight that reacts when a warning is given
 * @author Tessa Neal
 * 
 */
public class Knight implements Observer{
    
    private Subject watchman;

    /**
     * Creates a new knight that observes a watchman
     * @param watchman The watchman that the knight will observe
     */
    public Knight(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    /**
     * Prints the action of the knight after a warning is issued
     * @param warning The number of the warning that was issued
     */
    public void update(int warning) {
        if(warning == 1) {
            System.out.println("Knight: Helps everyone get home safe");
        }
        else if(warning == 2) {
            System.out.println("Knight: Prepares for battle");
        }
    }
}
