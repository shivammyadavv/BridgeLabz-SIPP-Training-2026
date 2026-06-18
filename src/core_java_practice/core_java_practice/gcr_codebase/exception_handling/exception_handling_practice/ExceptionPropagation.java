package core_java_practice.core_java_practice.gcr_codebase.exception_handling.exception_handling_practice;

public class ExceptionPropagation {

    public static void method1() {

        int result = 10 / 0;
    }

    public static void method2() {

        method1();
    }

    public static void main(String[] args) {

        try {

            method2();

        } catch (ArithmeticException exception) {

            System.out.println(
                    "Handled exception in main");
        }
    }
}
