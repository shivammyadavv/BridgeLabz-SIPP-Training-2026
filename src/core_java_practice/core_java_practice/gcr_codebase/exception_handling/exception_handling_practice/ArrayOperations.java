package core_java_practice.core_java_practice.gcr_codebase.exception_handling.exception_handling_practice;

public class ArrayOperations {

    public static void printValue(
            Integer[] numbers,
            int index) {

        try {

            System.out.println(
                    "Value at index "
                            + index + ": "
                            + numbers[index]);

        } catch (
                ArrayIndexOutOfBoundsException exception) {

            System.out.println(
                    "Invalid index!");

        } catch (
                NullPointerException exception) {

            System.out.println(
                    "Array is not initialized!");
        }
    }

    public static void main(String[] args) {

        Integer[] numbers =
                {10, 20, 30, 40};

        printValue(numbers, 8);

        numbers = null;

        printValue(numbers, 1);
    }
}
