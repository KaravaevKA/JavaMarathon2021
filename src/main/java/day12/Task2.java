package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addListWithEvenNumbers(0,30,list);
        addListWithEvenNumbers(300,350,list);
    }

    public static void addListWithEvenNumbers(int origin, int bound, List<Integer> list){
        //bound включена в интервал (учитывать ее значение или нет?)?

        for (int i = origin; i < bound; i++) {
            if (i % 2 == 0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
