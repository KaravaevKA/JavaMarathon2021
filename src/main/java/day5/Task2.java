package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Honda", "Black", 2023);
        System.out.println("Model: " + motorbike.getModel());
        System.out.println("Color: " + motorbike.getColor());
        System.out.println("Year of manufacture: " + motorbike.getYearOfManufacture());
    }
}
