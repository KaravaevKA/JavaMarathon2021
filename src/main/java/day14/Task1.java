package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");

        printSomeDigits(file);
    }

    public static void printSomeDigits(File file) {

        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;
            String line = scanner.nextLine();
            String[] numbersSring = line.split(" ");
            int counter = 0;
            if (numbersSring.length != 10) {
                throw new IllegalArgumentException("Некорректный входной файл");
            } else {
                for (int i = 0; i < numbersSring.length; i++) {
                    sum += Integer.parseInt(numbersSring[i]);
                }
            }
            System.out.println(sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }

    }
}
