package state;

/**
 * The state that a user's package is in after it ships
 * @author Tessa Neal
 */
public class InTransitState extends State{

    private int days;

    /**
     * Constructs an in-transit state with the details of the user's package
     * @param pkg A Package representing the user's package
     * @param quantity A integer representing how many items the user ordered
     */
    public InTransitState(Package pkg, int quantity) {
        super(pkg, quantity);
        days = 5;
    }

    /**
     * Updates the user on the status of their package
     * @return A String representation of a status update for the user's package after it was shipped
     */
    public String getStatus() {
        return "The "+pkg.getName()+" "+getVerb("is", "are")+" out for delivery";
    }

    /**
     * Updates the user on the ETA of their package
     * @return A String representation of the ETA of the user's package after it was shipped
     */
    public String getETA() {
        return "The "+pkg.getName()+" should arrive within "+days+" days";
    }

    /**
     * Describes how the delay will affect the user's package
     * @return A String representation describing that the package was delayed and how much longer it will take
     */
    public String delay() {
        days += 3;
        return "The "+pkg.getName()+" "+getVerb("has", "have")+" experienced a delay in shipping.\nThe "+pkg.getName()+" should arrive within "+days+" days";
    }
    
}
