class BAcount {
    private double balance = 1000;
    private boolean lock;

    private void add(double amount) {
        if (lock) {
            return;
        }
        lock = true;
        balance += amount;
        lock = false;
    }
}