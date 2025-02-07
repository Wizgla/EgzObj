package E13_zad1_music;

import java.util.Comparator;

public class DurationComparator implements Comparator<Song> {
    public int compare(Song o1,Song o2){
        return Integer.compare(o2.getDuration(),o1.getDuration());
    }
}
