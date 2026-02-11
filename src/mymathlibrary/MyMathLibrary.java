package mymathlibrary;

public class MyMathLibrary {

    public static void main(String[] args) {
        System.out.println("=== My Math Library Test ===\n");

        // 1. Testing Arithmetic
        Arithmetic math = new Arithmetic();
        math.setNum1(10);
        math.setNum2(5);
        System.out.println("Addition: " + math.add());
        System.out.println("Division: " + math.divide());

        // Test divide by zero
        math.setNum2(0);
        System.out.print("Divide by Zero Test: ");
        math.divide(); 

        System.out.println("-------------------------");

        // 2. Testing Geometry
        Geometry shapes = new Geometry();
        shapes.setNum1(5); // Radius is 5
        System.out.println("Circle Area (Radius 5): " + shapes.getCircleArea());

        shapes.setNum1(10); // Length
        shapes.setNum2(4);  // Width
        System.out.println("Rectangle Perimeter: " + shapes.getRectPerimeter());

        System.out.println("-------------------------");

        // 3. Testing Number Checks
        NumberCheck check = new NumberCheck();
        
        check.setNum1(10);
        System.out.println("Is 10 Even? " + check.isEven());

        check.setNum1(5);
        System.out.println("Factorial of 5: " + check.getFactorial());

        check.setNum1(7);
        System.out.println("Is 7 Prime? " + check.isPrime());
    }
}