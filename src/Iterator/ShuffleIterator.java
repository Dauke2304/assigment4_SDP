package Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleIterator implements Iterator {
    private List<Song> shuffledSongs;
    private int currentPosition = 0;

    public ShuffleIterator(List<Song> songs) {
        this.shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(this.shuffledSongs);
    }

    @Override
    public boolean hasNext() {
        return currentPosition < shuffledSongs.size();
    }

    @Override
    public Song next() {
        return shuffledSongs.get(currentPosition++);
    }
}
