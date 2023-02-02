package factory;

import java.util.ArrayList;

/**
 * A type of toy that is sold at toy stores
 * @author Tessa Neal
 */
public abstract class Puzzle {
    
    protected String name;
    protected String material;
    protected ArrayList<String> pieces;

    /**
     * Describes the puzzle being put together
     * @return A string representation of the steps that were taken to put the puzzle together
     */
    public String assemble() {
        String result = "";
        result += "Putting together a "+name+"\n";
        result += "This puzzle is made out of "+material+"\n";
        result += "Adding the following pieces\n";
        for(String piece : pieces) {
            result += "-  "+piece+"\n";
        }

        return result;
    }

    /**
     * Describes the puzzle being put in a box
     * @return A string representation of the puzzle being put in a box
     */
    public String boxPuzzle() {
        return "Putting the "+name+" in a box";
    }
}
