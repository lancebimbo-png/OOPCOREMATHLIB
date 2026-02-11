package mymathlibrary;

public class Geometry extends MathOperation {

    // Calculates Area of a Circle (Uses num1 as Radius)
    public double getCircleArea() {
        double radius = getNum1();
        return 3.1416 * radius * radius;
    }

    // Calculates Perimeter of a Rectangle (Uses num1 as Length, num2 as Width)
    public double getRectPerimeter() {
        double length = getNum1();
        double width = getNum2();
        return 2 * (length + width);
    }
}