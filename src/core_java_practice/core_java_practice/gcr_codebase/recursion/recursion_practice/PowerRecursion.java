package core_java_practice.core_java_practice.gcr_codebase.recursion.recursion_practice;

public class PowerRecursion {

    public static long calculatePower(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * calculatePower(base, exponent - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;

        long result = calculatePower(base, exponent);

        System.out.println(result);
    }
}
