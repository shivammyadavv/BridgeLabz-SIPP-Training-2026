package core_java_practice.core_java_practice.gcr_codebase.exception_handling.exception_handling_practice;

public class NestedTryCatch {

    public static void main(String[] args) {

        int[] numbers =
                {10, 20, 30, 40};

        int index = 2;
        int divisor = 0;

        try {

            try {

                int value =
                        numbers[index];

                int result =
                        value / divisor;

                System.out.println(
                        "Result = " + result);

            } catch (
                    ArithmeticException exception) {

                System.out.println(
                        "Cannot divide by zero!");
            }

        } catch (
                ArrayIndexOutOfBoundsException exception) {

            System.out.println(
                    "Invalid array index!");
        }
    }
}
