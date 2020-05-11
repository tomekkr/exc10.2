import java.util.InputMismatchException;

class CashMachine {
    public static void main(String[] args) {
        try {
            Person person = new Person("Marian", "Kowalski", "1231231366");
            BankAccount bankAccount = new BankAccount(person, 2000);
            CashMachineService cashMachineService = new CashMachineService();
            cashMachineService.cashMachineMenu(bankAccount);
        } catch (WithdrawGreaterThanCurrentBalanceException | WithdrawLimitExceededException
                | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Wpisano niepoprawną wartość");
        }
    }
}
