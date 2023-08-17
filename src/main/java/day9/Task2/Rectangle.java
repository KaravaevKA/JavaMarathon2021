package day9.Task2;

public class Rectangle extends Figure{
    private double firstSideLength;
    private double secondSideLength;

    @Override
    public double area() {
        return firstSideLength*secondSideLength;
    }

    @Override
    public double perimeter() {
        return 2*(firstSideLength+secondSideLength);
    }



    public Rectangle(String color, double firstSideLength, double secondSideLength ) {
        super(color);
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }
}
