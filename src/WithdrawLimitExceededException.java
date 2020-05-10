class WithdrawLimitExceededException extends Exception {
    public WithdrawLimitExceededException(double withdrawLimit) {
        super("Kwota wypłaty nie może być wyższa niż " + withdrawLimit);
    }
}
