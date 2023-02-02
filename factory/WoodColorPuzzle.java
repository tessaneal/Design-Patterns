package factory;

import java.util.ArrayList;

/**
 * A type of color puzzle that can be ordered from the Melissa and Doug Toy Store
 * @author Tessa Neal
 */
public class WoodColorPuzzle extends Puzzle{
    
    /**
     * Creates a new wooden color puzzle by adding each puzzle piece
     */
    public WoodColorPuzzle() {
        this.name = "Color Puzzle by Melissa and Doug";
        this.material = "wood";
        this.pieces = new ArrayList<String>();
        this.pieces.add("Red Fish");
        this.pieces.add("Yellow Fish");
        this.pieces.add("Green Fish");
        this.pieces.add("Purple Fish");
        this.pieces.add("Pink Fish");
        this.pieces.add("Orange Fish");
        this.pieces.add("Brown Fish");
        this.pieces.add("White Fish");
        this.pieces.add("Black Fish");
    }
}
