package observer;

/**
 * A person that is updated by a subject
 * @author Tessa Neal
 * 
 */
public interface Observer {
    /**
     * Updates the observer with the current warning
     * @param warning The number of the warning that was issued
     */
    public void update(int warning);
}
