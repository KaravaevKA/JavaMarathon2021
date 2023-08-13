package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car =new Car();
        car.setYear(2020);
        car.info();
        System.out.println(car.yearDifference(2023));
        Motorbike motorbike = new Motorbike("Ducato", "Black", 2015);
        motorbike.info();
        System.out.println(motorbike.yearDifference(2023));
    }
}
