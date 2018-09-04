class NamePrinter {
  String[] firstNames = {"Ivan", "I. P.", "Jacques", "Al"};
  String[] lastNames = new String[firstNames.length];

  void printNames() {
    for(int i = 0; i < firstNames.length; i++) {
      boolean hasLastName = lastNames[i] != null && !lastNames[i].isEmpty();
      String name = hasLastName ? firstNames[i] + " " + lastNames[i] : firstNames[i];
      System.out.println(name);
    }
  }

  public static void main (String args[]) {
    NamePrinter printer = new NamePrinter();
    printer.printNames();
    System.out.println("--------");
    printer.lastNames[0] = "Amandahugankiss";
    printer.lastNames[1] = "Freely";
    printer.lastNames[2] = "Strap";
    printer.lastNames[3] = "Coholic";
    printer.printNames();
  }
}
