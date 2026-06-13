package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level1;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void generateException(String text) {

        int number = Integer.parseInt(text);

        System.out.println(number);
    }

    public static void handleException(String text) {

        try {

            int number = Integer.parseInt(text);

            System.out.println(number);

        } catch (NumberFormatException exception) {

            System.out.println("NumberFormatException Handled");

        } catch (RuntimeException exception) {

            System.out.println("Runtime Exception Handled");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = scanner.next();

        // generateException(text);

        handleException(text);
    }
}
