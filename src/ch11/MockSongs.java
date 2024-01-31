package ch11;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    //    public static List<SongV2> getSongV2(){
    //        List<SongV2> songs = new ArrayList<>();
    //        songs.add(new SongV2("somersault", "zero 7", 147));
    //        songs.add(new SongV2("cassidy", "grateful dad", 158));
    //        songs.add(new SongV2("$10", "hitchhiker", 110));
    //        songs.add(new SongV2("havana", "cabello", 105));
    //        songs.add(new SongV2("cassidy", "grateful dad", 158));
    //        songs.add(new SongV2("50 ways", "simon", 102));
    //        return songs;
    //    }
    public static List<SongV3> getSongV3() {
        List<SongV3> songs = new ArrayList<>();
        songs.add(new SongV3("somersault", "zero 7", 147));
        songs.add(new SongV3("cassidy", "grateful dad", 158));
        songs.add(new SongV3("$10", "hitchhiker", 140));
        songs.add(new SongV3("havana", "cabello", 105));
        songs.add(new SongV3("$10", "hitchhiker", 140));
        songs.add(new SongV3("cassidy", "grateful dad", 158));
        songs.add(new SongV3("50 ways", "simon", 102));
        return songs;
    }
    
    public static List<SongV4> getSongV4() {
        List<SongV4> songs = new ArrayList<>();
        songs.add(new SongV4("someresult", "zero 7", 147));
        songs.add(new SongV4("cassidy", "grateful dad", 158));
        songs.add(new SongV4("$10", "hichhiker", 140));
        songs.add(new SongV4("havana", "cabello", 105));
        songs.add(new SongV4("$10", "hichhiker", 140));
        songs.add(new SongV4("cassidy", "grateful dad", 158));
        songs.add(new SongV4("50 ways", "simon", 102));
        return songs;
    }
}
