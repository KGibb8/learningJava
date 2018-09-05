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
    for(Player player : this.players) {
      String output = player.fullName() + " bowled a " + player.bowl();
      System.out.println(output);
    }
  }

  public void displayPlayers () {
    for(Player player : this.players) {
      System.out.println(player.fullName());
    }
  }
}
