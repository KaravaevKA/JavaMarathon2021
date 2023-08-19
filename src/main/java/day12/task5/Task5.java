package day12.task5;


import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicBand musicBand = new MusicBand("AC/DC",1970);
        MusicBand musicBand1 = new MusicBand("Metallica", 1981);
        List<MusicArtist> musicArtists = new ArrayList<>();
        musicArtists.add(new MusicArtist("Angus Young",66));
        musicArtists.add(new MusicArtist("Malcolm Young",66));
        musicBand.addMembersToGroup(musicArtists);
        System.out.println(musicBand);
        System.out.println(musicBand1);
        MusicBand.transferMembers(musicBand,musicBand1,musicArtists);
        System.out.println(musicBand);
        System.out.println(musicBand1);
    }
}
