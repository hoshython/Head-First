package ch11;

import java.util.Collections;
import java.util.List;

public class JukeBox2 {
    public static void main(String[] args) {
        new JukeBox2().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongV3();
        ListPrinter.prettyPrint("Unsorted", songList);

        songList.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
        ListPrinter.prettyPrint("Sorted by title", songList);

        songList.sort((o1, o2) -> o1.getArtist().compareTo(o2.getArtist()));
        ListPrinter.prettyPrint("Sorted by artist", songList);

        songList.sort((o1, o2) -> Integer.compare(o1.getBpm(), o2.getBpm()));
        ListPrinter.prettyPrint("Sorted by bpm", songList);
    }
}
