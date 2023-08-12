package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Ferrari");
        car.setColor("Red");
        car.setYearOfManufacture(2023);
        System.out.println("Автомобиль: " + car.getModel());
        System.out.println("Цвет: " + car.getColor());
        System.out.println("Год выпуска: " + car.getYearOfManufacture());
    }
}
