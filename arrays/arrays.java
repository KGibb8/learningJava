class Main {
  public static void main (String[] args) {
    // Declare an empty array
    int[] array;
    // Declare an array with a length of 10
    array = new int[10];
    System.out.println(array.length);
    array[0] = 1;
    array[1] = array[0] + 41;
    String output = "The meaning of life is " + array[1];
    System.out.println(output);

    // Arrays can also be declared with contents with curly braces
    int[] arr = {1, 2, 3, 4, 5};
    int index = 0;
    // Lets loop over them all
    while (index < arr.length) {
      int timesFive = arr[index] * 5;
      // And we can convert an Integer to a string!
      String timesFiveString = Integer.toString(timesFive);
      System.out.println(timesFiveString);
      index++;
    };

    // We can also write it as a for loop
    for(int i = 0; i < arr.length; i++) {
      int timesTen = arr[i] * 10;
      String timesTenString = Integer.toString(timesTen);
      System.out.println(timesTenString);
    };

    // We can also get a block to run once, and loop back through to meet a condition
    do {
      System.out.println("Hey Hey We're the Monkees");
      index++;
    } while (index < 10);

    // Or the Foreach loop which is shortened for loop...
    String[] monkeying = {"once", "twice", "thrice"};
    for(String el : monkeying) {
      System.out.println("People say we Monkee around" + " " + el);
    };
  }
}
