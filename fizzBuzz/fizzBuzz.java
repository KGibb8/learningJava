class FizzBuzz {
  boolean isFizz (int num) {
    boolean fizzy = num % 3 == 0;
    return fizzy;
  };

  boolean isBuzz (int num) {
    boolean buzzy = num % 5 == 0;
    return buzzy;
  };

  public static void main (String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();

    for(int i = 1; i < 101; i ++) {
      String placeHolder = new String();
      if (fizzBuzz.isFizz(i)) {
        placeHolder = placeHolder + "Fizz";
      }
      if (fizzBuzz.isBuzz(i)) {
        placeHolder = placeHolder + "Buzz";
      }
      boolean fizBuzzing = placeHolder != null && !placeHolder.isEmpty();
      if (fizBuzzing)
        System.out.println(placeHolder);
      else
        System.out.println(i);
    }
  }
}
