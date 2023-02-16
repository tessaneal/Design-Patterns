package singleton;

/**
 * Musical content that can be played on a juke box
 * @author Tessa Neal
 */
public class Song {
    private String title;
    private String artist;

    /**
     * Creates a new song with the indicated title and artist
     * @param title The title of the song
     * @param artist The artist that made the song
     */
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    /**
     * Returns the title of this song
     * @return A String representation of the title of this song
     */
    public String getTitle() {
        return title;
    }

    /**
     * Return the title of the song and the artist
     * @return A string representation of this song
     */
    public String toString() {
        return title+" by "+artist;
    }
}
