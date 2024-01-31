package ch11;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JukeBox3 {
    public static void main(String[] args) {
        List<SongV3> songList = MockSongs.getSongV3();
        ListPrinter.prettyPrint("Unsorted", songList);
        
        songList.sort((s1, s2) -> s1.getTitle().compareTo(s2.getTitle()));
        ListPrinter.prettyPrint("List sorted by title", songList);
        
        Set<SongV3> songSet = new HashSet<>(songList);
        System.out.println(songSet);
    }
}
