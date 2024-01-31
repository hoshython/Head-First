package ch12;

import java.util.List;
import java.util.stream.Collectors;

public class SongTestDrive {
    public static void main(String[] args) {
        List<Song> songsList = Songs.getSongs();
        System.out.println(songsList);
        System.out.println(songsList.stream().filter(song -> song.getGenre().equals("Rock"))
                                    .collect(Collectors.toList()));
        System.out.println(songsList.stream().filter(song -> song.getGenre().toLowerCase().contains("rock"))
                                    .collect(Collectors.toList()));
    }
}