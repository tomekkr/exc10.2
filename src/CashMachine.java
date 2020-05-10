class CashMachine {
    public static void main(String[] args) {
        Person person = new Person("Marian", "Kowaslki", "1231231366");
        try {
            BankAccount bankAccount = new BankAccount(person, 10000);
            System.out.println(person + "; " + bankAccount);
            bankAccount.withdraw(1000);
            bankAccount.deposit(100);
            bankAccount.withdraw(200);
            bankAccount.withdraw(1000.1);
            System.out.println(person + "; " + bankAccount);
        } catch (NullPointerException | WithdrawGreaterThanCurrentBalanceException | WithdrawLimitExceededException e) {
            System.err.println(e.getMessage());
        }
    }
}
