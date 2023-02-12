package iterator;

/**
 * Musical content that can be put on an album
 * @author Tessa Neal
 */
public class Song {
    private String name;
    private String artist;
    private double length;
    private Genre genre;

     /**
     * Creates a new song with the indicated name, artist, length, and genre
     * @param name The name of the song
     * @param artist The artist that the song is made by
     * @param length The length of the song
     * @param genre The genre of the song
     */
    public Song(String name, String artist, double length, Genre genre) {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    /**
     * Describes a song by providing its details
     * @return A string representation of the song and its details
     */
    public String toString() {
        String result = "";
        result += name+" by ";
        result += artist+" category: ";
        
        String genreName = genre.name();
        String[] genreString = genreName.split("_");
        for(String i : genreString) {
            result += i+" ";
        }

        result += "length: "+length+" min";

        return result;
    }
}
