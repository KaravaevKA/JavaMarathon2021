package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int zeroEnds = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100001);
        }
        for (int num: array) {
            if (num < min) min = num;
            if (num > max) max = num;
            if (num % 10 == 0) zeroEnds++;
            if (num% 10 == 0) sum+=num;
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(zeroEnds);
        System.out.println(sum);
    }
}
