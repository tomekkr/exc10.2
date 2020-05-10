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

    public double getBalance() {
        return balance;
    }

    public Person getPerson() {
        return person;
    }

    public void deposit(double amount) {
        if (amount < 0)
            throw new IllegalArgumentException("Kwota wpłaty nie może być mniejsza niż 0");
        balance += amount;
    }

    public void withdraw(double amount) throws WithdrawGreaterThanCurrentBalanceException, WithdrawLimitExceededException {
        if (balance - amount < 0)
            throw new WithdrawGreaterThanCurrentBalanceException("Nie można wypłacić żadanej kwoty (" + amount + "). " +
                    "Brak wystarczających środków na koncie (aktualne saldo: " + balance + ")");
        if (amount > WITHDRAW_LIMIT)
            throw new WithdrawLimitExceededException(WITHDRAW_LIMIT);
        if (amount < 0)
            throw new IllegalArgumentException("nie może być mniejsza niż 0");
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
