class BankAccount {
    private Person person;
    private double balance;

    public BankAccount(Person person, double balance) {
        if (person == null)
            throw new NullPointerException("Pole person nie może być puste");
        this.person = person;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount < 0)
            throw new IllegalArgumentException("Nie można wypłacić żadanej kwoty (" + amount + "). " +
                    "Brak wystarczających środków na koncie (aktualne saldo: " + balance + ")");
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
