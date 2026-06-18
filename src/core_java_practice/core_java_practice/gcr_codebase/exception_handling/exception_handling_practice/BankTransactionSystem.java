package core_java_practice.core_java_practice.gcr_codebase.exception_handling.exception_handling_practice;

class InsufficientBalanceException
        extends Exception {

    public InsufficientBalanceException(
            String message) {

        super(message);
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double balance) {

        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount < 0) {

            throw new IllegalArgumentException(
                    "Invalid amount!");
        }

        if (amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient balance!");
        }

        balance -= amount;

        System.out.println(
                "Withdrawal successful, new balance: "
                        + balance);
    }
}

public class BankTransactionSystem {

    public static void main(String[] args) {

        BankAccount bankAccount =
                new BankAccount(5000);

        try {

            bankAccount.withdraw(7000);

        } catch (
                InsufficientBalanceException exception) {

            System.out.println(
                    exception.getMessage());

        } catch (
                IllegalArgumentException exception) {

            System.out.println(
                    exception.getMessage());
        }
    }
}
