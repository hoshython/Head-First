package ch11;

public class SongV4 {
    private String title;
    private String artist;
    private int bpm;

    public SongV4(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    @Override
    public boolean equals(Object obj) {
        SongV4 anotherSong = (SongV4) obj;
        return this.title.equals(anotherSong.getTitle());
    }

    @Override
    public int hashCode() {
        return this.title.hashCode();

    }

    @Override
    public String toString() {
        return title;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }
}
