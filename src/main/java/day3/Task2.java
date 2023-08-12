package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int numFirst = scanner.nextInt();
            int numSecond = scanner.nextInt();
            if (numSecond == 0) {
                break;
            }
            double result = (double) numFirst / numSecond;
            System.out.println(result);
        }
    }
}
