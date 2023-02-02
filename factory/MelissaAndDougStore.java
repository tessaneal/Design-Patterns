package factory;

/**
 * A type of toy store that produces wooden toys
 * @author Tessa Neal
 */
public class MelissaAndDougStore extends ToyStore {

    /**
     * Creates a puzzle of the indicated type
     * @param type The type of puzzle that was ordered
     * @return The puzzle that was created
     */
    public Puzzle createPuzzle(String type) {
        if(type.equalsIgnoreCase("color")) {
            WoodColorPuzzle puzzle = new WoodColorPuzzle();
            return puzzle;
        } else if (type.equalsIgnoreCase("animal")) {
            WoodAnimalPuzzle puzzle = new WoodAnimalPuzzle();
            return puzzle;
        }

        return null;
    }    
}
