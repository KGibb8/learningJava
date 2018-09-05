public class Player {
  String firstName;
  String lastName;

  public Player (String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  };

  public int bowl () {
    Turn turn = this.takeTurn();
    return turn.score();
  };

  public String fullName () {
    return this.firstName + " " + this.lastName;
  };

  Turn takeTurn () {
    return new Turn();
  };
};
