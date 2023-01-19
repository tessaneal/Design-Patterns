package observer;

/**
 * A person that updates its list of observers
 * @author Tessa Neal
 * 
 */
public interface Subject {

    /**
     * Adds an observer to the list of people this subject has to update
     * @param observer The observer that will be updated by this subject
     */
    public void registerObserver(Observer observer);

    /**
     * Removes an observer from the list of people this subject has to update
     * @param observer The observer that will not get updated by this subject anymore
     */
    public void removeObserver(Observer observer);

    /**
     * Updates each observer on this subject's list
     */
    public void notifyObservers();
}
