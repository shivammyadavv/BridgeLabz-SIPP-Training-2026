package core_java_practice.core_java_practice.gcr_codebase.recursion.recursion_practice;

public class FibonacciRecursion {

    public static int findFibonacci(int number) {

        if (number <= 1) {
            return number;
        }

        return findFibonacci(number - 1) + findFibonacci(number - 2);
    }

    public static void main(String[] args) {
        int number = 6;

        int fibonacciNumber = findFibonacci(number);

        System.out.println(fibonacciNumber);
    }
}