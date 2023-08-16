package day8;

public class Task1 {
    public static void main(String[] args) {
        String str = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            str = str + i + " ";
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы в мс: " + (stopTime - startTime));
        StringBuilder stringBuilder = new StringBuilder();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i);
        }
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы в мс: " + (stopTime1 - startTime1));
    }
}
