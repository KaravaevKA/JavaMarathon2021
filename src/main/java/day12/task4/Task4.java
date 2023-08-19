package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
            MusicBand musicBand = new MusicBand("AC/DC",1970);
        List<String> list = new ArrayList<>();
        list.add("Brian Johnson");
        list.add("Angus Young");
        list.add("Malcolm Young");
        list.add("Chris Slade");
        musicBand.addMembersToGroup(list);
        System.out.println(musicBand);
//        List<String> exclude = new ArrayList<>();
//        exclude.add("Malcolm Young");
//        exclude.add("Chris Slade");
//        musicBand.deleteMembers(exclude,list);
//        System.out.println(musicBand);
        MusicBand musicBand1 = new MusicBand("Metallica", 1981);
        System.out.println(musicBand1);
        MusicBand.transferMembers(musicBand,musicBand1,list);
        System.out.println(musicBand);
        System.out.println(musicBand1);
        musicBand1.printMembers();
    }
}
