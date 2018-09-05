class Main {
  public static void main (String[] args) {
    String[] players = {"I.P. Freely", "Ivan Amanda Hugankiss", "Al Coholic", "Hugh Jass"};
    Game game = new Game(players);
    System.out.println("New Game Started: " + game);
    System.out.println("\n-------------------------\n");
    game.displayPlayers();
    System.out.println("\n-------------------------\n");
    game.start();
  }
}
