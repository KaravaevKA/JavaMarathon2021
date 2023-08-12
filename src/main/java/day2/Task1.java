package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int levelCount = scanner.nextInt();
        if(levelCount>0 && levelCount<=4){
            System.out.println("Малоэтажный дом");
        } else if (levelCount>=5 && levelCount <=8) {
            System.out.println("Среднеэтажный дом");
        } else if (levelCount>=9) {
            System.out.println("Многоэтажный дом");
        }
        else System.out.println("Ошибка ввода");
    }
}
