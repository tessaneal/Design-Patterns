package iterator;

/**
 * A collection of songs
 * @author Tessa Neal
 */
public class Album {
   private Song[] songs = new Song[20];
   private int count;
   private String name;
   
   /**
    * Creates a new album with the indicated name
    * @param name The name of the album
    */
   public Album(String name) {
        this.name = name;
   }

   /**
    * Adds the indicated song to this album if there is room on it
    * @param name The name of the song
    * @param artist The name of the artist that created the song
    * @param length The length of the song
    * @param genre The genre of the song
    * @return A boolean representing if the song was added to this album or not
    */
   public boolean addSong(String name, String artist, double length, Genre genre) {
        Song song = new Song(name, artist, length, genre);
        boolean added = false;
        for(int i=0; i < songs.length && added == false; i++) {
            if(songs[i] == null) {
                songs[i] = song;
                added = true;
            }
        }

        return added;
   }

   /**
    * Creates a new album iterator with the songs on this album
    * @return An album iterator that will go through the songs on this album
    */
   public AlbumIterator createIterator() {
        AlbumIterator albumIterator = new AlbumIterator(songs);
        return albumIterator;
   }

   /**
    * Describes the name of the album
    * @return A string representation of the name of the album
    */
   public String getName() {
        return name;
   }
}
