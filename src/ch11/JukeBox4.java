package ch11;

import java.util.Set;
import java.util.TreeSet;

public class JukeBox4 {
    public static void main(String[] args) {
        //        Set<SongV4> songSet = new HashSet<>(MockSongs.getSongV4());
        //        System.out.println(songSet);
        
        Set<SongV4> songSet = new TreeSet<>((o1, o2) -> o1.getBpm() - o2.getBpm());
        songSet.addAll(MockSongs.getSongV4());
        System.out.println(songSet);
        
        Set<SongV4> songSet2 = new TreeSet<>((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
        songSet2.addAll(MockSongs.getSongV4());
        System.out.println(songSet2);
    }
}
