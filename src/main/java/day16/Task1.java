package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        printResult(file);
    }

    public static void printResult(File file){
        try (Scanner scanner = new Scanner(file)){
            float sum = 0;
            float sumAvg = 0;
            while (scanner.hasNextLine()){
                String[] numbers = scanner.nextLine().split(" ");
                for (int i = 0; i < numbers.length; i++) {
                    sum += Integer.parseInt(numbers[i]);
                }
                sumAvg = sum / numbers.length;
            }
            System.out.println(sumAvg + " --> " + String.format("%.3f",sumAvg));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

