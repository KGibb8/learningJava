class AIsLessThanC {
  public static void main(String[] args) {
    int a = 1;
    int c = 4;
    boolean b = a < c;

    if (b) {
      String output = a + " is less than " + c;
      System.out.println(output);
    }

    if (a < c) {
      String output =  a + " is less than " + c + " again!";
      System.out.println(output);
    }
  }
}
