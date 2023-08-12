package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int numFirst = scanner.nextInt();
            int numSecond = scanner.nextInt();
            if (numSecond == 0){
                System.out.println("Деление на 0");
                continue;
            }

            double result = (double) numFirst / numSecond;
            System.out.println(result);

        }
    }
}
