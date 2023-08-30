package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        printResult(file1);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Random random = new Random();
        PrintWriter printWriter = new PrintWriter(file);
        for (int i = 0; i < 1000; i++) {
            printWriter.println(random.nextInt(100));
        }
        printWriter.close();

        Scanner scanner = new Scanner(file);
        File file2 = new File("file2.txt");
        PrintWriter printWriter1 = new PrintWriter(file2);
        int counter = 0;
        int sum = 0;
        while (scanner.hasNextLine()){
            sum += Integer.parseInt(scanner.nextLine());
            counter++;
            if(counter == 20){
                printWriter1.println(sum/20.0);
                counter = 0;
                sum = 0;
            }
        }
        printWriter1.close();
        Scanner scanner1 = new Scanner(file2);
        double result =0;
        while (scanner1.hasNextLine()){
            result += Double.parseDouble(scanner1.nextLine());
        }
        System.out.println((int) result);
    }
}
