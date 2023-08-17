package day9.Task2;

public class Triangle extends Figure{
    private double firstSideLength;
    private double secondSideLength;
    private double thirdSideLength;


    @Override
    public double area() {
        double halfPerimeter = (firstSideLength + secondSideLength +thirdSideLength)/2.0;
        return Math.sqrt(halfPerimeter*(halfPerimeter-firstSideLength)*(halfPerimeter-secondSideLength)*(halfPerimeter-thirdSideLength));
    }

    @Override
    public double perimeter() {

        return firstSideLength + secondSideLength + thirdSideLength;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public Triangle(String color, double firstSideLength, double secondSideLength, double thirdSideLength) {
        super(color);
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
        this.thirdSideLength = thirdSideLength;
    }
}
