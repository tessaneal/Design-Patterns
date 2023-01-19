package observer;

import java.util.ArrayList;

/**
 * A type of subject known as a watchman that warns the townspeople he watched over
 * @author Tessa Neal
 * 
 */
public class Watchman implements Subject{
    
    private ArrayList<Observer> observers;
    private int warning;

    /**
     * Creates a new watchman that will alert the town with trumpets
     */
    public Watchman() {
        observers = new ArrayList<Observer>();
        warning = 0;
    }

    /**
     * Adds a townsperson to the list of people the watchman has to warn
     * @param observer The townsperson that will observe the watchman
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes a townsperson from the list of people the watchman has to warn
     * @param observer The townsperson that will not observe the watchman anymore
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Updates each townsperson on the watchman's list with the current warning
     */
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(warning);
        }
    }

    /**
     * Updates the current warning and prints out how many trumpets were played
     * @param warning The number of trumpets that will play
     */
    public void issueWarning(int warning) {
        this.warning = warning;
        if(warning == 1) {
            System.out.println("WARNING:  1 trumpet was played!");
        }
        else if(warning == 2) {
            System.out.println("WARNING:  2 trumpets were played!");
        }
        notifyObservers();
    }
}
