package iterator;

import java.util.Iterator;

/**
 * An iterator that will go through and return the different songs on the album
 * @author Tessa Neal
 */
public class AlbumIterator {
    private Song[] songs = new Song[20];
    private int position = 0;

    /**
     * Creates a new album iterator with the designated songs
     * @param songs An array of the songs that are on the album
     */
    public AlbumIterator(Song[] songs) {
        this.songs = songs;
    }

    /**
     * Returns whether there is a song after the current one
     * @return A boolean representation of whether there is a song after the current one or not
     */
    public boolean hasNext() {
        if(position >= songs.length || songs[position] == null) {
            return false;
        }
        return true;
    }

    /**
     * Returns the song at the current position and updates the position
     * @return The song at the current position on the album
     */
    public Song next() {
        Song song = songs[position];
        position += 1;
        return song;
    }
}
