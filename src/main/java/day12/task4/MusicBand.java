package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public static void transferMembers(MusicBand a, MusicBand b){
        b.members.addAll(a.members);
        a.members.clear();
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public void addMembersToGroup(List<String> members){
        this.members.addAll(members);
    }

    public List<String> getMembers() {
        return members;
    }

    public void printMembers(){
        for (String member:members) {
            System.out.println(member);
        }
    }

    public MusicBand(String name, int year, List<String> members ) {
        this.name = name;
        this.year = year;
        this.members = members;

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
