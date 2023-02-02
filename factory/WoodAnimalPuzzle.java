package factory;

import java.util.ArrayList;

/**
 * A type of animal puzzle that can be ordered from the Melissa and Doug Toy Store
 * @author Tessa Neal
 */
public class WoodAnimalPuzzle extends Puzzle {
    
    /**
     * Creates a new wooden animal puzzle by adding each puzzle piece
     */
    public WoodAnimalPuzzle() {
        this.name = "Animal Puzzle by Melissa and Doug";
        this.material = "wood";
        this.pieces = new ArrayList<String>();
        this.pieces.add("Horse");
        this.pieces.add("Sheep");
        this.pieces.add("Dog");
        this.pieces.add("Cat");
        this.pieces.add("Cow");
        this.pieces.add("Chicken");
    }
}
