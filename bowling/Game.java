public class Game {
  Player[] players;

  public Game (String[] playerNames) {
    this.players = new Player[playerNames.length];

    for(int i = 0; i < playerNames.length; i++) {
      String[] names = playerNames[i].split(" ");
      this.players[i] = new Player(names[0], names[1]);
    }
  }

  public void displayPlayers () {
    for(Player player : this.players) {
      System.out.println(player.fullName());
    }
  }
}
