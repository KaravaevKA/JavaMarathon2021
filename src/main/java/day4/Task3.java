package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int max = Integer.MIN_VALUE;
        int index = 0;
        int indexMax = 0;
        int[][] matrix = new int[12][8];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = random.nextInt(51);
            }
        }
        for (int i = 0; i < 12; i++) {
            int sum =0;
            for (int j = 0; j < 8; j++) {
                sum+=matrix[i][j];
                index = i;
                if(sum > max) {
                    max = sum;
                    indexMax = index;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("Cумма: " + sum + ", ряд: " + index);
        }
        System.out.println("Максимальная сумма: " + max);
        System.out.println("Максимальный индекс: " + indexMax);
    }
}
