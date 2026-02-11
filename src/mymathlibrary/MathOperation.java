package mymathlibrary;

public class MathOperation {
    
    // These are private so only this class can touch them directly (Encapsulation)
    private double num1;
    private double num2;

    // Constructor: Sets numbers to 0 by default
    public MathOperation() {
        this.num1 = 0;
        this.num2 = 0;
    }

    // Methods to let other classes READ the numbers
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    // Methods to let other classes CHANGE the numbers
    public void setNum1(double value) {
        this.num1 = value;
    }

    public void setNum2(double value) {
        this.num2 = value;
    }
}