package factory;

/**
 * A type of toy store that produces plastic toys
 * @author Tessa Neal
 */
public class FisherPriceStore extends ToyStore {
    
    /**
     * Creates a puzzle of the indicated type
     * @param type The type of puzzle that was ordered
     * @return The puzzle that was created
     */
    public Puzzle createPuzzle(String type) {
        if(type.equalsIgnoreCase("color")) {
            PlasticColorPuzzle puzzle = new PlasticColorPuzzle();
            return puzzle;
        } else if (type.equalsIgnoreCase("animal")) {
            PlasticAnimalPuzzle puzzle = new PlasticAnimalPuzzle();
            return puzzle;
        }

        return null;
    }
}
