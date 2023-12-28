package winterbreakstudying;

public class Main {
  public static void main(String[] args) {

    String a = "\nthis is me\n\n";

    System.out.print(a);

    System.out.print("==========");

    System.out.print(trailingNewLineStrip(a));

    System.out.println(System.getProperty("line.separator"));

    System.out.println((int) System.getProperty("line.separator").charAt(0));
  }

  private static String trailingNewLineStrip(String input) {

    String stringCopy = input;

    while (stringCopy.substring(0, 1).equals("\n")) {
      stringCopy = stringCopy.substring(1);
    }

    while (stringCopy.substring(stringCopy.length() - 1).equals("\n")) {
      System.out.print("Before: " + stringCopy);
      stringCopy = stringCopy.substring(0, stringCopy.length() - 1);

      System.out.print("After: " + stringCopy);
    }

    return stringCopy;
  }
}
