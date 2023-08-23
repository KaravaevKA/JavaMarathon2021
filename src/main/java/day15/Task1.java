package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/shoes.csv");

        try (PrintWriter printWriter = new PrintWriter("src/main/resources/missing shoes.txt", StandardCharsets.UTF_8);
             Scanner scanner = new Scanner(file)){
            File fileResult = new File("src/main/resources/data.txt");

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] shoe = line.split(";");
                int count = Integer.parseInt(shoe[2]);
                if (count == 0){
                    printWriter.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
