package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/dushi.txt");
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            int n = 0;
            HashMap<Integer,String> text = new HashMap<>();
            while (scanner.hasNext()){
                text.put(n, scanner.next());
                n++;
            }
            int count = 0;
            for (Map.Entry<Integer,String> entry : text.entrySet()) {
                    if (entry.getValue().equals("души")){
                        count++;
                    }
            }
            //Чичиков - 601
            //душа - 16
            //души - 75

            System.out.println(count);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
