package state;

/**
 * A state that a user's package can be in throughout the shipping process
 * @author Tessa Neal
 */
public abstract class State {

    protected Package pkg;
    protected int quantity;

    /**
     * Constructs an instance of a state for the user's package
     * @param pkg A Package representing the user's package
     * @param quantity A integer representing how many items the user ordered
     */
    public State(Package pkg, int quantity) {
        this.pkg = pkg;
        this.quantity = quantity;
    }

    /**
     * Updates the user on the status of their package
     * @return A String representation of a status update for the user's package
     */
    public abstract String getStatus();

    /**
     * Updates the user on the ETA of their package
     * @return A String representation of the ETA of the user's package
     */
    public abstract String getETA();

    /**
     * Describes how the delay will affect the user's package
     * @return A String representation describing if the package was delayed and how much longer it could take
     */
    public abstract String delay();

    /**
     * Determines whether a singular or plural verb should be used based on the number of items in the package
     * @param singular A String representing the singular option for the verb
     * @param plural A String representing the plural option for the verb
     * @return A String represnetation of the correct verb
     */
    protected String getVerb(String singular, String plural) {
        if(quantity <= 1) {
            return singular;
        }
        else {
            return plural;
        }
    }
    
}
