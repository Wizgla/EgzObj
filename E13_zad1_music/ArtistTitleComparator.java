package E13_zad1_music;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    public int compare(Song o1,Song o2){
        int result = o2.getArtist().compareTo(o1.getArtist());
        if(result==0){
            return o2.getTitle().compareTo(o1.getTitle());
        }
        return result;
    }
}
