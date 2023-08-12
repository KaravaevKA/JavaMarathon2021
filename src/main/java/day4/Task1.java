package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] array = new int[n];
        int moreThanEight = 0;
        int isEqualOne = 0;
        int isEven = 0;
        int isNotEven = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i ++) {
            array[i] = random.nextInt(11);
        }

        for (int num:array) {
            if(num > 8) moreThanEight++;
            if (num == 1) isEqualOne++;
            if (num % 2 == 0) {
                isEven++;
            } else isNotEven++;
            sum +=num;
        }
        for (int num: array) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + moreThanEight);
        System.out.println("Количество чисел равных 1: " + isEqualOne);
        System.out.println("Количество четных чисел: " + isEven);
        System.out.println("Количество нечетных чисел: " + isNotEven);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
