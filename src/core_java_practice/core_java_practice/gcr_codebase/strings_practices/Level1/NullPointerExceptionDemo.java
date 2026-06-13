package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level1;

public class NullPointerExceptionDemo {

    // Method to generate exception
    public static void generateException() {

        String text = null;

        System.out.println(text.length());
    }

    // Method to handle exception
    public static void handleException() {

        try {

            String text = null;
            System.out.println(text.length());

        } catch (NullPointerException exception) {

            System.out.println("NullPointerException Handled");

        } catch (RuntimeException exception) {

            System.out.println("Runtime Exception Handled");
        }
    }

    public static void main(String[] args) {

        // generateException();

        handleException();
    }
}
