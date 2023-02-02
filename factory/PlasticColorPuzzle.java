package factory;

import java.util.ArrayList;

/**
 * A type of color puzzle that can be ordered from the Fisher Price Toy Store
 * @author Tessa Neal
 */
public class PlasticColorPuzzle extends Puzzle {
    
    /**
     * Creates a new plastic color puzzle by adding each puzzle piece
     */
    public PlasticColorPuzzle() {
        this.name = "Color Puzzle by Fisher Price";
        this.material = "plastic";
        this.pieces = new ArrayList<String>();
        this.pieces.add("Green Dog");
        this.pieces.add("Orange Dog");
        this.pieces.add("Red Dog");
        this.pieces.add("Blue Dog");
        this.pieces.add("Yellow Dog");
        this.pieces.add("Brown Dog");
    }
}
