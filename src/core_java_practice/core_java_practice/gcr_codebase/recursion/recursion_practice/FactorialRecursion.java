package core_java_practice.core_java_practice.gcr_codebase.recursion.recursion_practice;

public class FactorialRecursion {

    public static long calculateFactorial(int number) {
        if (number <= 1) {
            return 1;
        }

        return number * calculateFactorial(number - 1);
    }

    public static void main(String[] args) {
        int number = 5;

        long factorial = calculateFactorial(number);

        System.out.println("Factorial = " + factorial);
    }
}
