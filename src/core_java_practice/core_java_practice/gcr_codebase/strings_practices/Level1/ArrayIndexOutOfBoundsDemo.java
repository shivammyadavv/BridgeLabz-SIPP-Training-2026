package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static String[] getNames(int totalNames, Scanner scanner) {

        String[] names = new String[totalNames];

        for (int index = 0; index < names.length; index++) {

            System.out.print("Enter Name " + (index + 1) + ": ");
            names[index] = scanner.next();
        }

        return names;
    }

    public static void handleException(String[] names) {

        try {

            System.out.println(names[names.length]);

        } catch (ArrayIndexOutOfBoundsException exception) {

            System.out.println("ArrayIndexOutOfBoundsException Handled");

        } catch (RuntimeException exception) {

            System.out.println("Runtime Exception Handled");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Names: ");
        int totalNames = scanner.nextInt();

        String[] names = getNames(totalNames, scanner);

        handleException(names);
    }
}
