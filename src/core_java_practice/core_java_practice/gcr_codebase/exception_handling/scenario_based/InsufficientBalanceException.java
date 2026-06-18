package core_java_practice.core_java_practice.gcr_codebase.exception_handling.scenario_based;

class InsufficientBalanceException extends Exception {

    private double availableBalance;
    private double requestedAmount;

    public InsufficientBalanceException(
            String message,
            double availableBalance,
            double requestedAmount) {

        super(message);

        this.availableBalance = availableBalance;
        this.requestedAmount = requestedAmount;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}
