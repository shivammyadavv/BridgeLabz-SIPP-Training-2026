package core_java_practice.core_java_practice.gcr_codebase.recursion.recursion_practice;

public class SumOfNaturalNumbers {

    public static int calculateSum(int number) {
        if (number == 1) {
            return 1;
        }

        return number + calculateSum(number - 1);
    }

    public static void main(String[] args) {
        int number = 5;

        int sum = calculateSum(number);

        System.out.println("Sum = " + sum);
    }
}
