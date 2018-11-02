public class Player {
    public final int startBalance = 1000;
    public Account balance;
    private int boardPosition;

    public Player() {
        boardPosition = 0;
        balance = new Account(startBalance);
    }

    public int getBoardPosition() {
        return boardPosition;
    }

    public void moveForward(int spaces) {}
}
