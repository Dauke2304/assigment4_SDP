package Iterator;

import java.util.List;

public class GenreFilterIterator implements Iterator {
    private List<Song> songs;
    private String genre;
    private int currentPosition = 0;

    public GenreFilterIterator(List<Song> songs, String genre) {
        this.songs = songs;
        this.genre = genre;
    }

    @Override
    public boolean hasNext() {
        while (currentPosition < songs.size()) {
            Song song = songs.get(currentPosition);
            if (song.getGenre().equalsIgnoreCase(genre)) {
                return true;
            }
            currentPosition++;
        }
        return false;
    }

    @Override
    public Song next() {
        return songs.get(currentPosition++);
    }
}
