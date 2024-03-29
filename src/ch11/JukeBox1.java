package ch11;

import java.util.List;

public class JukeBox1 {
    public static void main(String[] args) {
        new JukeBox1().go();
    }
    
    private void go() {
        //        List<SongV2> songList = MockSongs.getSongV2();
        //        System.out.println(songList);
        //        Collections.sort(songList);
        //        System.out.println(songList);
        List<SongV3> songList = MockSongs.getSongV3();
        
        ListPrinter.prettyPrint("Unsorted", songList);
        
        TitleComparator titleComparator = new TitleComparator();
        songList.sort(titleComparator);
        ListPrinter.prettyPrint("Sorted by title", songList);
        
        songList.sort(new ArtistComparator());  // same ass Collections.sort(songList, new ArtistCompare());
        ListPrinter.prettyPrint("Sorted by artist", songList);
        
        BpmComparator bpmComparator = new BpmComparator();
        songList.sort(bpmComparator); // same ass Collections.sort(songList, BpmCompare);
        ListPrinter.prettyPrint("Sorted by bpm", songList);
    }
}
