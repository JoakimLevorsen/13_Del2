public class Game {

    public Dice dice1;
    public Dice dice2;
    public Player[] players;
    public UIManager manager;

    public Game(int numberOfPlayers, int diceOneMax, int diceTwoMax, UIManagaer UI1){
        players = new Players[numberOfPlayers];
        for(int i = 0; i < numberOfPlayers; i++){
            players[i] = new Player();

        }
        dice1 = new Dice(diceOneMax);
        dice2 = new Dice(diceTwoMax);
        manager = UI1;

    }
    public void takeTurn(int playerID){

        int roll1 = dice1.roll();
        int roll2 = dice2.roll();
        DiceRoll myRoll = new DiceRoll(roll1, roll2);
        Player player = players[playerID];
        player.moveForward(myRoll.getValue());
        manager.updateUI();

    }

}
