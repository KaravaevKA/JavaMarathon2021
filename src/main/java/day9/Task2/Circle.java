package day9.Task2;

public class Circle extends Figure{
    private double radius;

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
}
