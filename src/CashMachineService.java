import java.util.Scanner;

class CashMachineService {
    private static final int EXIT = 0;
    private static final int WITHDRAW = 1;
    private static final int DEPOSIT = 2;
    private static final int SHOW_CURRENT_ACCOUNT_BALANCE = 3;

    void cashMachineMenu(BankAccount bankAccount) {
        int option;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jesteś zalogowany jako: " + bankAccount.getPerson());
        System.out.println("1 - wypłata środków, 2 - wpłata środków, 3 - stan konta, 0 - wyjście");

        do {
            System.out.println("Wpisz numer opcji: ");
            option = scanner.nextInt();
            switch (option) {
                case EXIT:
                    System.out.println("Dziękujemy za skorzystanie z naszych usług. Zapraszamy ponownie.");
                    break;
                case WITHDRAW:
                    System.out.println("Wpisz kwotę, którą chcesz wypłacić: ");
                    bankAccount.withdraw(scanner.nextDouble());
                    break;
                case DEPOSIT:
                    System.out.println("Wpisz kwotę, którą chcesz wpłacić: ");
                    bankAccount.deposit(scanner.nextDouble());
                    break;
                case SHOW_CURRENT_ACCOUNT_BALANCE:
                    System.out.println("Dostępne środki: " + bankAccount.getBalance());
                    break;
                default:
                    System.out.println("Niepoprawny numer opcji, spróbuj jeszcze raz");
            }
        } while (option != 0);
        scanner.close();
    }
}
