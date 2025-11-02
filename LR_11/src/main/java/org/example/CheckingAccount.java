import org.example.Account;

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Превышен лимит овердрафта для счета " + getAccountNumber());
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber='" + getAccountNumber() + '\'' +
                ", balance=" + getBalance() +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}