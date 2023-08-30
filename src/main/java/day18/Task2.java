package day18;

public class Task2 {
    public static void main(String[] args) {
        int number = 717771237;
        System.out.println(count7(number));

    }

    public static int count7(int num) {
        int count = 0;
        if (num / 10 == 0) {
            if (num % 10 == 7)
                count++;
            return count;
        }
        if (num % 10 == 7)
            count++;
        return count + count7(num / 10);
    }
}
