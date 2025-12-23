class InsufficientBalanceException extends RuntimeException {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class UncheckedCustomException {
    static void withdraw(int balance, int amount) {

        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        } else {
            System.out.println("Withdrawal successful");
        }
    }

    public static void main(String[] args) {
        withdraw(5000, 7000);
    }
}
