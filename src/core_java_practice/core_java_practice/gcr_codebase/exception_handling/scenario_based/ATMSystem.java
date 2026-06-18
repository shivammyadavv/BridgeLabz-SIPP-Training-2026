package core_java_practice.core_java_practice.gcr_codebase.exception_handling.scenario_based;

public class ATMSystem {

    public static void withdraw(
            double balance,
            double withdrawalAmount)
            throws InsufficientBalanceException {

        if (withdrawalAmount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient Balance",
                    balance,
                    withdrawalAmount);
        }

        System.out.println(
                "Withdrawal Successful");
    }

    public static void main(String[] args) {

        try {

            withdraw(5000, 8000);

        } catch (InsufficientBalanceException exception) {

            System.out.println(
                    exception.getMessage());

            System.out.println(
                    "Available Balance: ₹" +
                            exception.getAvailableBalance());

            System.out.println(
                    "Requested Amount: ₹" +
                            exception.getRequestedAmount());
        }
    }
}