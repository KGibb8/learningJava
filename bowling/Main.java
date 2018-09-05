class Main {
  public static void main (String[] args) {
    String[] players = {"I. P. Freely", "Ivan Amanda Hugankiss", "Al Coholic", "Hugh Jass"};
    Game game = new Game(players);
    System.out.println(game);
    game.displayPlayers();
  }
}
