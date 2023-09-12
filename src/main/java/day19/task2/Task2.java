package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        HashMap<Integer, Point> taxis = new HashMap<>();
        taxiLocation(taxis);
    }

    public static void taxiLocation(HashMap<Integer, Point> map) {
        File file = new File("src/main/resources/taxi_cars.txt");
        Scanner scanner1 = new Scanner(System.in);
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] taxi = line.split(" ");
                int taxiId = Integer.parseInt(taxi[0]);
                int taxiXPos = Integer.parseInt(taxi[1]);
                int taxiYPos = Integer.parseInt(taxi[2]);
                map.put(taxiId, new Point(taxiXPos, taxiYPos));
            }

            System.out.println("Введите координату x первой точки: ");
            int x1 = scanner1.nextInt();
            System.out.println("Введите координату y первой точки: ");
            int y1 = scanner1.nextInt();
            System.out.println("Введите координату x второй точки: ");
            int x2 = scanner1.nextInt();
            System.out.println("Введите координату y второй точки: ");
            int y2 = scanner1.nextInt();
            if (x1 > x2) {
                int temp = x2;
                x2 = x1;
                x1 = temp;
            }
            if (y1 > y2) {
                int temp = y2;
                y2 = y1;
                y1 = temp;
            }

            int counter = 0;
            Map<Integer, Point> locatedCars = new HashMap<>();
            for (Map.Entry<Integer, Point> car : map.entrySet()) {
                if ((car.getValue().getX() > x1 && car.getValue().getX() < x2) && (car.getValue().getY() > y1 && car.getValue().getY() < y2)) {
                    locatedCars.put(car.getKey(), car.getValue());
                    counter++;
                }
            }
            if (locatedCars.isEmpty()) {
                System.out.println("В данном районе машин не найдено");
            } else {
                System.out.printf("В данном районе найдено %d машин", counter);
                System.out.print("\n");
                System.out.println("Найденные машины: ");
                System.out.println(locatedCars.keySet());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        }
    }
}

