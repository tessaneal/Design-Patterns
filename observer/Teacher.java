package observer;

/**
 * A type of observer known as a teacher that reacts when a warning is given
 * @author Tessa Neal
 * 
 */
public class Teacher implements Observer{
    
    private Subject watchman;

    /**
     * Creates a new teacher that observes a watchman
     * @param watchman The watchman that the teacher will observe
     */
    public Teacher(Subject watchman) {
        this.watchman = watchman;
        watchman.registerObserver(this);
    }

    /**
     * Prints the action of the teacher after a warning is issued
     * @param warning The number of the warning that was issued
     */
    public void update(int warning) {
        if(warning == 1) {
            System.out.println("Teacher: Helps get every kid home safe");
        }
        else if(warning == 2) {
            System.out.println("Teacher: Brings all students to the underground shelter");
        }
    }
}
