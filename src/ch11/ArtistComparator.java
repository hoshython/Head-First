package ch11;

import java.util.Comparator;

public class ArtistComparator implements Comparator<SongV3> {
    @Override public int compare(SongV3 s1, SongV3 s2) {
        return s1.getArtist().compareTo(s2.getArtist());
    }
}
