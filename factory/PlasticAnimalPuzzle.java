package factory;

import java.util.ArrayList;

/**
 * A type of animal puzzle that can be ordered from the Fisher Price Toy Store
 * @author Tessa Neal
 */
public class PlasticAnimalPuzzle extends Puzzle {
    
    /**
     * Creates a new plastic animal puzzle by adding each puzzle piece
     */
    public PlasticAnimalPuzzle() {
        this.name = "Animal Puzzle by Fisher Price";
        this.material = "plastic";
        this.pieces = new ArrayList<String>();
        this.pieces.add("Fox");
        this.pieces.add("Elephant");
        this.pieces.add("Giraffe");
        this.pieces.add("Owl");
        this.pieces.add("Monkey");
    }
}
