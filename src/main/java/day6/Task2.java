package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus",2018,50,120);
        airplane.info();
        airplane.setManufacturer("Boeing");
        airplane.setYear(2019);
        airplane.setLength(65);
        airplane.fillUp(50);
        airplane.fillUp(65);
        airplane.info();
    }
}
