package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public Iterator createSequentialIterator() {
        return new SequentialIterator(songs);
    }

    public Iterator createShuffleIterator() {
        return new ShuffleIterator(songs);
    }

    public Iterator createGenreFilterIterator(String genre) {
        return new GenreFilterIterator(songs, genre);
    }
}

