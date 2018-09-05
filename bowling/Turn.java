import java.lang.Math;

public class Turn {
  Integer score;

  public int score () {
    this.go();
    return this.score;
  }

  void go () {
    boolean hasScored = this.score != null;
    double bowl = Math.random() * 10;
    Integer score = new Integer((int) bowl);
    this.score = hasScored ? this.score : score;
  }
}
