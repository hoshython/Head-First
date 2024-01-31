package ch12;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Set;

public class SongTestDrive {
    public static void main(String[] args) {
        List<Song> songsList = Songs.getSongs();
        System.out.println(songsList);
        System.out.println(
                songsList.stream().filter(song -> song.getGenre().equals("Rock")).collect(Collectors.toList()));
        System.out.println(songsList.stream().filter(song -> song.getGenre().toLowerCase().contains("rock"))
                                    .collect(Collectors.toList()));
        System.out.println(songsList.stream().filter(song -> song.getArtist().toLowerCase().contains("beatles"))
                                    .filter(song -> song.getYear() >= 1968)
                                    .filter(song -> song.getTitle().startsWith("C")).collect(Collectors.toList()));
        System.out.println(songsList.stream().map(Song::getGenre).distinct().collect(Collectors.toList()));
        
        String songTitle = "With a Little Help from My Friends";
        System.out.println(songsList.stream().filter(song -> song.getTitle().equals(songTitle)).map(Song::getArtist)
                                    .filter(artist -> !artist.equals("The Beatles")).collect(Collectors.toSet()));
        Set<String> genres = songsList.stream().map(Song::getGenre).collect(Collectors.toSet());
        System.out.println(songsList.stream().anyMatch(song -> song.getGenre().equals("R&B")));
        System.out.println(songsList.stream().noneMatch(song -> song.getArtist().equals("hooshi")));
        System.out.println(songsList.stream().allMatch(song -> song.getYear() > 1000));
        System.out.println(songsList.stream().filter(song -> song.getYear() == 1995).findFirst());
        System.out.println(songsList.stream().map(Song::getArtist).distinct().count());
        //        System.out.println(songsList.stream().filter(song -> song.getYear() > 1900));
        Optional<Song> optionalSong = songsList.stream().filter(song -> song.getArtist() == "Joe Cocker").findFirst();
        //        System.out.println(optionalSong);
        if (optionalSong.isEmpty()) {
            System.out.println("Artist not found");
        } else {
            System.out.println("Title: " + optionalSong.stream().map(Song::getTitle).collect(Collectors.joining()));
        }
        System.out.println(songsList.stream().max(Comparator.comparingInt(Song::getTimesPlayed)));
    }
}