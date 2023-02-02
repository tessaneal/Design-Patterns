package factory;

/**
 * A store that allows puzzles to be ordered
 * @author Tessa Neal
 */
public abstract class ToyStore {

    /**
     * Takes a puzzle order, assembles it, and boxes it up
     * @param type The type of puzzle that was ordered
     * @return A string representation of the process of assembling and boxing up the puzzle that was ordered
     */
    public String orderPuzzle(String type) {
        Puzzle puzzle = createPuzzle(type);
        String result = "";
        result += puzzle.assemble();
        result += puzzle.boxPuzzle();
        result += "\n";

        return result;
    }

    /**
     * Creates a new puzzle of an indicated type
     * @param type The type of puzzle that was ordered
     * @return The puzzle that was created by either a Fisher Price Store or a Melissa and Doug Store
     */
    public abstract Puzzle createPuzzle(String type);
}