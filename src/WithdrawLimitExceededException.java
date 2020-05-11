class WithdrawLimitExceededException extends RuntimeException {
    public WithdrawLimitExceededException(double withdrawLimit) {
        super("Kwota wypłaty nie może być wyższa niż " + withdrawLimit);
    }
}
