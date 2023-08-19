package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("AC/DC", 1970));
        bands.add(new MusicBand("Bon Jovi",1983));
        bands.add(new MusicBand("Metallica",1981));
        bands.add(new MusicBand("Iron Maiden",1975));
        bands.add(new MusicBand("Parkway Drive",2005));
        bands.add(new MusicBand("Disturbed", 1996));
        bands.add(new MusicBand("FFDP",2005));
        bands.add(new MusicBand("Onlap",2009));
        bands.add(new MusicBand("Hollywood Undead",2005));
        bands.add(new MusicBand("Insomnia",2002));
        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));
    }


    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band: bands) {
            if (band.getYear() > 2000){
                groupsAfter2000.add(band);
            }
        }
        return groupsAfter2000;
    }
}
