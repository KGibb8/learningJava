import java.util.Random;

public class Turn {
  public Integer[] bowls = new Integer[2];
  public Player player;
  public Turn lastTurn;
  int remainingPins = 10;

  public int score () {
    this.start();
    int score = 0;

    if (this.isTurkey()) {
      System.out.println("**** TURKEY?!?! ****");
      score = 30;
    }
    else if (this.isDoubleStrike()) {
      System.out.println("**** DOUBLE STRIKE ****");
      score = 20 + this.lastTurn.lastTurn.bowls[1];
    }
    else if (this.isStrike()) {
      System.out.println("**** STRIKE ****");
      if (this.hasLastTurn()) score = 10 + this.lastTurn.score();
      else score = 10;
    }
    else if (this.isSpare()) {
      System.out.println("**** SPARE ****");
      if (this.hasLastTurn()) score = 10;
      else score = 10 + this.lastTurn.bowls[1];
    }
    else score = bowls[0] + bowls[1];

    return score;
  };

  public void player (Player player) {
    this.player = player;
  }

  public void lastTurn (Turn lastTurn) {
    this.lastTurn = lastTurn;
  }

  void start() {
    System.out.println(this.bowls.length);
    for(int i = 0; i < this.bowls.length; i++) {
      this.bowls[i] = this.bowl();
    };
  };

  boolean hasLastTurn () {
    return this.lastTurn == null;
  }

  boolean isStrike () {
    return this.remainingPins == 0 &&
      this.bowls[0] == 10;
  };

  boolean isDoubleStrike () {
    return this.isStrike() &&
      this.hasLastTurn() &&
      this.lastTurn.isStrike();
  }

  boolean isTurkey () {
    return this.isDoubleStrike() &&
      this.lastTurn.hasLastTurn() &&
      this.lastTurn.lastTurn.isStrike();
  }

  boolean isSpare () {
    return this.remainingPins == 0 &&
      this.bowls[0] < 10;
  };

  boolean hasBowledOnce () {
    return this.bowls[0] != null &&
      this.bowls[1] == null;
  };

  boolean isComplete () {
    return this.bowls[0] != null &&
      this.bowls[1] != null;
  };

  Integer bowl () {
    if (remainingPins == 0) {
      return new Integer(0);
    } else {
      Random random = new Random();
      int pinsKnocked = random.nextInt(remainingPins + 1);
      System.out.println(player.fullName() + " bowled a " + pinsKnocked);
      remainingPins = remainingPins - pinsKnocked;
      return new Integer(pinsKnocked);
    }
  };
};
