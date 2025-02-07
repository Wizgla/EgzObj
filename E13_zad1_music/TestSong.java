package E13_zad1_music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSong {
    public static void main(String[] args) {
        // ✅ Создаем ArrayList песен
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Bohemian Rhapsody", "Queen", 355));
        songs.add(new Song("Stairway to Heaven", "Led Zeppelin", 480));
        songs.add(new Song("Hotel California", "Eagles", 390));
        songs.add(new Song("Imagine", "John Lennon", 183));
        songs.add(new Song("Smells Like Teen Spirit", "Nirvana", 300));
        songs.add(new Song("Billie Jean", "Michael Jackson", 295));
        songs.add(new Song("Like a Rolling Stone", "Bob Dylan", 370));
        songs.add(new Song("Comfortably Numb", "Pink Floyd", 384));
        songs.add(new Song("Bohemian Rhapsody123", "Queen", 355)); // Дублируем песню

        // ✅ Сортируем сначала по длительности (DurationComparator)
        Collections.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));


        // ✅ Выводим результат
        System.out.println("Отсортированные песни:");
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
