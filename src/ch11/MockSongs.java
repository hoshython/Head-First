package ch11;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    //    public static List<SongV2> getSongV2(){
//        List<SongV2> songs = new ArrayList<>();
//        songs.add(new SongV2("someresult", "zero 7", 147));
//        songs.add(new SongV2("cassidy", "grateful dad", 158));
//        songs.add(new SongV2("$10", "hichhiker", 110));
//        songs.add(new SongV2("havana", "cabello", 105));
//        songs.add(new SongV2("Cassidy", "grateful dad", 158));
//        songs.add(new SongV2("50 ways", "simon", 102));
//        return songs;
//    }
    public static List<SongV3> getSongV3() {
        List<SongV3> songs = new ArrayList<>();
        songs.add(new SongV3("someresult", "zero 7", 147));
        songs.add(new SongV3("cassidy", "grateful dad", 158));
        songs.add(new SongV3("$10", "hichhiker", 110));
        songs.add(new SongV3("havana", "cabello", 105));
        songs.add(new SongV3("Cassidy", "grateful dad", 158));
        songs.add(new SongV3("50 ways", "simon", 102));
        return songs;
    }
}
