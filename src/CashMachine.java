class CashMachine {
    public static void main(String[] args) {
        Person person = new Person("Marian", "Kowaslki", "1231231366");
        try {
            BankAccount bankAccount = new BankAccount(person, 1000);
            System.out.println(person + "; " + bankAccount);
            bankAccount.withdraw(999);
            bankAccount.deposit(100);
            bankAccount.withdraw(200);
            System.out.println(person + "; " + bankAccount);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
