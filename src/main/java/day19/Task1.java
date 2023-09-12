package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/dushi.txt");
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            List<String> text = new ArrayList<>();
            while (scanner.hasNext()) {
                text.add(scanner.next());
            }
            Set<String> words = new HashSet<>();
            words.addAll(text);
            Map<Integer, String> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();

            int counter = 1;
            for (String word : words) {
                String buffer = word;
                for (int i = 0; i < text.size(); i++) {
                    if (text.get(i).equals(buffer))
                        counter++;
                }
                list.add(counter);
                map.put(counter, word);
                counter = 1;
            }
            Collections.sort(list);
            Collections.reverse(list);
            for (int i = 0; i < 100; i++) {
                System.out.println(map.get(list.get(i)) + " : " + list.get(i));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
