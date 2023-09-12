package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers,numbers.length-1));
    }
    public static int recursionSum(int[] array, int num){
        if (num == 0){
            return array[num];
        }
        return array[num] + recursionSum(array,num-1);
    }
}
