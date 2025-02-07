package A11_zad2_playlists;

import java.util.Arrays;

public class TestPlaylist {
    public static void main(String[] args) {
        // Создаем массив песен
        Song[] songs = {
                new Song("Bohemian Rhapsody", "Queen", 355),
                new Song("Imagine", "John Lennon", 183),
                new Song("Hotel California", "Eagles", 390),
                new Song("Stairway to Heaven", "Led Zeppelin", 482),
                new Song("Hey Jude", "The Beatles", 431)
        };

        // Сортируем сначала по длительности
        Arrays.sort(songs, new DurationComparator());
        System.out.println("Сортировка по длительности (от длинных к коротким):");
        for (Song song : songs) {
            System.out.println(song);
        }

        // Сортируем по артисту и названию
        Arrays.sort(songs, new ArtistTitleComparator());
        System.out.println("\nСортировка по артисту и названию:");
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}

