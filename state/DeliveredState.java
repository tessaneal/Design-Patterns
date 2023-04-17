package state;

/**
 * The state that a user's package is in after it is delievred
 * @author Tessa Neal
 */
public class DeliveredState extends State{

    /**
     * Constructs a delivered state with the details of the user's package
     * @param pkg A Package representing the user's package
     * @param quantity A integer representing how many items the user ordered
     */
    public DeliveredState(Package pkg, int quantity) {
        super(pkg, quantity);
    }

    /**
     * Updates the user on the status of their package
     * @return A String representation of a status update for the user's package after it was delivered
     */
    public String getStatus() {
        return "The "+pkg.getName()+" "+getVerb("is", "are")+" here for you.";
    }

    /**
     * Updates the user that there is no ETA for their package because it has been delivered
     * @return A String representation describing that the user's package has been delivered already
     */
    public String getETA() {
        return "The "+pkg.getName()+" "+getVerb("is", "are")+" here";
    }

    /**
     * Describes that the delay will not affect the package because it has been delivered
     * @return A String representation describing that the package has already been delivered
     */
    public String delay() {
        return "The "+pkg.getName()+" "+getVerb("has", "have")+" already been delivered";
    }
    
}
