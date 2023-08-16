package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String city = scanner.next();
            if (city.equalsIgnoreCase("stop"))
                break;
            switch (city) {
                case "Москва":
                case "Ростов":
                case "Владивосток":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Лондон":
                case "Ливерпуль":
                case "Манчестер":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Бавария":
                    System.out.println("Германия");
                    break;
                case "Stop":
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
