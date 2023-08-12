package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        int max = Integer.MIN_VALUE;
        int maxSumIndex = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j <i+3 ; j++) {
               sum += array[j];
            }
            if(sum > max){
                max = sum;
                maxSumIndex = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
        System.out.println(maxSumIndex);
    }
}
