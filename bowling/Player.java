public class Player {
  String firstName;
  String lastName;

  public Player (String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  };

  public void bowl () {
    System.out.println("Bowling for Soup!");
  };

  public String fullName () {
    return this.firstName + " " + this.lastName;
  }
}
