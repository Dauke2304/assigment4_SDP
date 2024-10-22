import Iterator.*;
public class Main {
    public static void main(String[] args) {
        // Create a playlist and add songs
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Captain", "Myagi", "Rap"));
        playlist.addSong(new Song("F!ne", "Travis Scott", "Hip-hop"));
        playlist.addSong(new Song("Starboy", "Weeknd", "Pop"));
        playlist.addSong(new Song("Fly Me to the Moon", "Frank", "Jazz"));
        playlist.addSong(new Song("Beggin", "Maneskin", "Rock"));

        // Sequential traversal
        System.out.println("Sequential Traversal:");
        Iterator sequentialIterator = playlist.createSequentialIterator();
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next());
        }

        // Shuffle traversal
        System.out.println("\nShuffle Traversal:");
        Iterator shuffleIterator = playlist.createShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }

        // Genre filter traversal
        System.out.println("\nRock Genre Filter Traversal:");
        Iterator genreFilterIterator = playlist.createGenreFilterIterator("Rock");
        while (genreFilterIterator.hasNext()) {
            System.out.println(genreFilterIterator.next());
        }
    }
}


