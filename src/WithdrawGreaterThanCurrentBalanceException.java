class WithdrawGreaterThanCurrentBalanceException extends RuntimeException {
    public WithdrawGreaterThanCurrentBalanceException(String message) {
        super(message);
    }
}
