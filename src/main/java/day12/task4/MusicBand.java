package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public void deleteMembers(List<String> selectedMembers, List<String> members) {
        for (int i = 0; i < members.size(); i++) {
            for (int j = 0; j < selectedMembers.size(); j++) {
                if(members.get(i).equals(selectedMembers.get(j))){
                    members.remove(i);
                }
            }
        }
    }

    public static void transferMembers(MusicBand a, MusicBand b, List<String> members){
        List<String> transferedMembers = new ArrayList<>();
        for (String member: members) {
            transferedMembers.add(member);
        }
        a.members.clear();
        b.addMembersToGroup(transferedMembers);
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public void addMembersToGroup(List<String> members){
        this.setMembers(members);
    }

    public List<String> getMembers() {
        return members;
    }

    public void printMembers(){
        for (String member:members) {
            System.out.println(member);
        }
    }

    public MusicBand(String name, int year) {
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
