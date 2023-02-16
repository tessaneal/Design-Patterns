package singleton;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * A juke box plays songs picked by the user
 * @author Tessa Neal
 */
public class JukeBox {
    private static JukeBox jukeBox;
    private ArrayList<Song> songs;
    private Queue<String> songQueue;

    /**
     * Creates an instance of a juke box with the songs from songs.txt
     */
    private JukeBox() {
        songs = DataLoader.getSongs();
        songQueue = new LinkedList<String>();
    }

    /**
     * Checks if a juke box exists, if it doesn't it creates one
     * @return A juke box that has songs from songs.txt
     */
    public static JukeBox getInstance() {
        if(jukeBox == null) {
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }

    /**
     * Plays the song that is next up in the song queue
     * @return A string representation of the next song playing
     */
    public String playNextSong() {
        String songName = songQueue.remove();
        if(songName == null) {
            return "You need to add songs to the list";
        }
        Song playing = null;
        for(Song song : songs) {
            if(song.getTitle().equalsIgnoreCase(songName)) {
                playing = song;
            }
        }
        return "Let's jam to "+playing;
    }
    
    /**
     * Adds a requested t=song to the song queue if the juke box has it
     * @param title A string representing the title of the song
     * @return A string representation of where the song is on the song queue if the juke box has it
     */
    public String requestSong(String title) {
        boolean found = false;
        Song request = null;
        for(Song song : songs) {
            if(song.getTitle().equalsIgnoreCase(title)) {
                request = song;
                found = true;
            }
        }
        if(found == false) {
            return "Sorry we do not have the song "+title;
        }
        songQueue.add(request.getTitle());
        return title+" is now number "+songQueue.size()+" on the list";
    }

    /**
     * Checks whether the song queue has more songs or not
     * @return A boolean representing whether the song queue is empty or not
     */
    public boolean hasMoreSongs() {
        return !songQueue.isEmpty();
    }
}
