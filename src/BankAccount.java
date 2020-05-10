class BankAccount {
    private Person person;
    private double balance;
    private static final double WITHDRAW_LIMIT = 1000;

    public BankAccount(Person person, double balance) {
        if (person == null)
            throw new NullPointerException("Pole person nie może być puste");
        this.person = person;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws WithdrawGreaterThanCurrentBalanceException, WithdrawLimitExceededException {
        if (balance - amount < 0)
            throw new WithdrawGreaterThanCurrentBalanceException("Nie można wypłacić żadanej kwoty (" + amount + "). " +
                    "Brak wystarczających środków na koncie (aktualne saldo: " + balance + ")");
        if (amount > WITHDRAW_LIMIT)
            throw new WithdrawLimitExceededException(WITHDRAW_LIMIT);
        balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "person=" + person +
                ", balance=" + balance +
                '}';
    }
}
