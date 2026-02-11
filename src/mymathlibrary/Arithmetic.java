package mymathlibrary;

public class Arithmetic extends MathOperation {

    public double add() {
        return getNum1() + getNum2();
    }

    public double subtract() {
        return getNum1() - getNum2();
    }

    public double multiply() {
        return getNum1() * getNum2();
    }

    public double divide() {
        // Simple check to stop the program from crashing if dividing by zero
        if (getNum2() == 0) {
            System.out.println("Error: You cannot divide by zero!");
            return 0;
        }
        return getNum1() / getNum2();
    }
}