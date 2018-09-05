public class Player {
  String firstName;
  String lastName;
  int turnCount = 1;
  Turn[] turns = new Turn[10];

  public Player (String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  };

  public int bowl () {
    Turn turn;
    if (this.isFirstTurn()) {
      turn = new Turn();
      turn.player(this);
    } else {
      turn = new Turn();
      turn.player(this);
      turn.lastTurn(turns[turnCount - 1]);
    }

    this.turns[turnCount] = turn;
    this.turnCount++;
    return turn.score();
  };

  public String fullName () {
    return this.firstName + " " + this.lastName;
  };

  boolean isFirstTurn () {
    return turnCount == 1;
  }
};
