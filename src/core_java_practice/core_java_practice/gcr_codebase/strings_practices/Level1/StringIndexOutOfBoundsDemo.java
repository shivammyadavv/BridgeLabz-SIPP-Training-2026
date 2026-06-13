package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level1;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateException(String text) {

        System.out.println(text.charAt(text.length()));
    }

    public static void handleException(String text) {

        try {

            System.out.println(text.charAt(text.length()));

        } catch (StringIndexOutOfBoundsException exception) {

            System.out.println("StringIndexOutOfBoundsException Handled");

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
