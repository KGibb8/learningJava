class BooleanOperators {
  public static void main(String[]  args) {
    int a = 4;
    int b = 3;
    boolean result;

    String output = "When a is less than b";
    System.out.println(output);

    result = a < b;
    if (result) {
      String output = "This will never print";
      System.out.println(output);
    } else {
      String output = "Here's the else, since it ain't, so this will print";
      System.out.println(output);
    }

    String output = "When b is less than a";
    System.out.println(output);

    result = b < a;
    if (result) {
      String output = "This however, will!";
      System.out.println(output);
    }

    String output = "When a is equal to 4 AND b is equal to 3";
    System.out.println(output);

    result = a == 4 && b == 3;
    if (result) {
      String output = "This will also print as result is " + result;
      System.out.println(output);
    }
  }
}
