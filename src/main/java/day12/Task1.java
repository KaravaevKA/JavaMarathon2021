package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Audi");
        list.add("Ferrari");
        list.add("Bugatti");
        list.add("Porsche");
        list.add("McLaren");
        System.out.println(list);
        list.add(2,"Lada");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
