public class Game {
  Player[] players;

  public Game (String[] playerNames) {
    this.players = new Player[playerNames.length];

    for(int i = 0; i < playerNames.length; i++) {
      String[] names = playerNames[i].split(" ");
      this.players[i] = new Player(names[0], names[1]);
    }
  }

  public void start () {
    for(int i = 1; i < 10; i++) {
      int round = i;
      System.out.println("Round " + round);
      for(Player player : this.players) {
        String output = player.fullName() + " turn score total is " + player.bowl();
        System.out.println(output);
      }
    }
  }

  public void displayPlayers () {
    System.out.println("Players\n");
    for(Player player : this.players) {
      System.out.println(player.fullName());
    }
  }
}
