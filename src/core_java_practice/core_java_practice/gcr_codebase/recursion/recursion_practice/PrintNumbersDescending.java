package core_java_practice.core_java_practice.gcr_codebase.recursion.recursion_practice;

public class PrintNumbersDescending {

    public static void printNumbers(int number) {
        if (number == 0) {
            return;
        }

        System.out.print(number + " ");
        printNumbers(number - 1);
    }

    public static void main(String[] args) {
        int number = 5;

        printNumbers(number);
    }
}
