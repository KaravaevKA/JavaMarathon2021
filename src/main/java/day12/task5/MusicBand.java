package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public static void transferMembers(MusicBand a, MusicBand b){
        b.members.addAll(a.members);
        a.members.clear();
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public void addMembersToGroup(List<MusicArtist> members){
        this.members.addAll(members);
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void printMembers(){
        for (MusicArtist member:members) {
            System.out.println(member);
        }
    }

    public MusicBand(String name, int year ) {
        this.name = name;
        this.year = year;

    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}
