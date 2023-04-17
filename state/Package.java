package state;

/**
 * A package containing the item(s) that the user orders
 * @author Tessa Neal
 */
public class Package {

    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    /**
     * Constructs an instance of the user's package
     * @param name A String representing the name of the item in the package
     * @param quantity A String representing the amount of items in the user's package
     */
    public Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        orderedState = new OrderedState(this, quantity);
        inTransitState = new InTransitState(this, quantity);
        deliveredState = new DeliveredState(this, quantity);
    }
    
    /**
     * Changes the status of the user's package to the ordered status
     * @return A String representation of the status and eta for the package after it was ordered
     */
    public String order() {
        state = orderedState;
        String result = state.getStatus();
        result += "\n";
        result += state.getETA();
        return result;
    }

    /**
     * Changes the status of the user's package to the mailed status
     * @return A string representation of the status and eta for the package after it was mailed
     */
    public String mail() {
        state = inTransitState;
        String result = state.getStatus();
        result += "\n";
        result += state.getETA();
        return result;
    }

    /**
     * Changes the status of the user's package to the received status
     * @return A string representation of the status for the package after it was received
     */
    public String received() {
        state = deliveredState;
        return state.getStatus();
    }

    /**
     * Delays the delivery of the package for several days
     * @return A String representation of the status and eta of the package after it was delayed
     */
    public String delay() {
        return state.delay();
    }

    /**
     * Updates the state of our package
     * @param state A State representation of the state that the package should be updated to
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Returns the name of the package
     * @return A String represntation of the the name of the package
     */
    public String getName() {
        return name;
    }
    
}
