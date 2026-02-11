package mymathlibrary;

public class NumberCheck extends MathOperation {

    // Check if the number is Even
    public boolean isEven() {
        // If the remainder when divided by 2 is 0, it's even
        return (getNum1() % 2) == 0;
    }

    // Calculate Factorial (Example: 5! = 5*4*3*2*1 = 120)
    public int getFactorial() {
        int n = (int) getNum1(); // Convert double to int
        int result = 1;
        
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    // Check if the number is Prime
    public boolean isPrime() {
        int n = (int) getNum1();
        if (n <= 1) return false; // 0 and 1 are not prime

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // Found a number that divides evenly, so not prime
            }
        }
        return true;
    }
}