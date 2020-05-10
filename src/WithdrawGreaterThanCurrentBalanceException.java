class WithdrawGreaterThanCurrentBalanceException extends Exception {
    public WithdrawGreaterThanCurrentBalanceException(String message) {
        super(message);
    }
}
