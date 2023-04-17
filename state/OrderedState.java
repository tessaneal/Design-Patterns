package state;

/**
 * The state that a user's package is in when they first order it
 * @author Tessa Neal
 */
public class OrderedState extends State{

    private int days;

    /**
     * Constructs an ordered state with the details of the user's package
     * @param pkg A Package representing the user's package
     * @param quantity A integer representing how many items the user ordered
     */
    public OrderedState(Package pkg, int quantity) {
        super(pkg, quantity);
        days = 2;
    }

    /**
     * Updates the user on the status of their package
     * @return A String representation of a status update for the user's package after it was ordered
     */
    public String getStatus() {
        return "The "+pkg.getName()+" "+getVerb("was", "were")+" ordered";
    }

    /**
     * Updates the user on the ETA of their package
     * @return A String representation of the ETA of the user's package after it was ordered
     */
    public String getETA() {
        return "The "+pkg.getName()+" will be shipped within "+days+" business days";
    }

    /**
     * Describes how the delay will affect the user's package
     * @return A String representation describing that the package was delayed and how much longer it will take
     */
    public String delay() {
        days += 2;
        return "The "+pkg.getName()+" experienced a slight delay in manufacturing.\nThe "+pkg.getName()+" will be shipped within "+days+" business days";
    }
    
}
