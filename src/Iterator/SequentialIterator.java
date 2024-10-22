package Iterator;

import java.util.List;

public class SequentialIterator implements Iterator {
    private List<Song> songs;
    private int currentPosition = 0;

    public SequentialIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(currentPosition++);
    }
}

