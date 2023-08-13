package day6;

public class Car {
    private String model;
    private String color;
    private int yearOfManufacture;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return yearOfManufacture;
    }

    public void setYear(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear){
        return Math.abs(inputYear - this.yearOfManufacture);
    }
}
