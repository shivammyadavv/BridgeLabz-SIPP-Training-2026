package core_java_practice.core_java_practice.gcr_codebase.exception_handling.scenario_based;

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static void processBill(
            String totalBillText,
            int[] patientIds,
            int patientIndex,
            int itemCount,
            double walletBalance)
            throws InsufficientFundsException {

        try {

            int totalBillAmount =
                    Integer.parseInt(totalBillText);

            double costPerItem =
                    totalBillAmount / itemCount;

            System.out.println(
                    "Cost Per Item: " + costPerItem);

            System.out.println(
                    "Patient ID: " +
                            patientIds[patientIndex]);

            if (walletBalance < totalBillAmount) {
                throw new InsufficientFundsException(
                        "Payment Failed: Insufficient Funds");
            }

            System.out.println("Payment Successful");

        } catch (NumberFormatException exception) {

            System.out.println(
                    "Invalid Bill Amount Format");

        } catch (ArithmeticException exception) {

            System.out.println(
                    "Item Count Cannot Be Zero");

        } catch (ArrayIndexOutOfBoundsException exception) {

            System.out.println(
                    "Invalid Patient Index");
        }
    }

    public static void main(String[] args) {

        try {

            processBill(
                    "5000",
                    new int[]{101, 102, 103},
                    5,
                    0,
                    2000);

        } catch (InsufficientFundsException exception) {

            System.out.println(
                    exception.getMessage());
        }
    }
}