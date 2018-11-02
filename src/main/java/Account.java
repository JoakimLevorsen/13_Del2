public class Account {
    private int balance;

    public Account(int startBalance) {
        balance = startBalance;
    }

    public void increase(int by) {
        balance += by;
    }

    public void deduct(int by) {
        balance -= by;
        if (balance < 0) {
            balance = 0;
        }
    }

    public int getBalance() {
        return balance;
    }
}
