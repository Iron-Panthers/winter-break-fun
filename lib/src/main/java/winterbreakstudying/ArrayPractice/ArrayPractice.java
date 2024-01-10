package winterbreakstudying.ArrayPractice;

import java.util.Arrays;

public class ArrayPractice {
  public ArrayPractice() {}

  // Run me to see if your methods work
  // Comment out which methods you don't want to see in the output
  public static void main(String[] args) {

    // Check to see if your practice method works
    practiceOutput();

    // Check to see if your divisible works
    divisibleOutput();
  }

  public static void practice() {
    // Initialize me with these values: 3, 5, 10
    int[] arr = {3, 5, 10};

    // Print out each value in the array with a for loop
    for (int i = 1; i < arr.length; i++) {

      System.out.println(arr[i]);
    }
    // Change the value of 10 ==> 7
    arr[3] = 7;
    // Print out the length of the array
    System.out.println(arr.length);
    // Multiply all the values in the array by 2 using a for loop
    for (int i = 1; i < arr.length; i++) {
      arr[i] = arr[i] * 2;
    }
  }

  /**
   * Write some logic (for loop!) that would find every value in an array with non-zero values that
   * are divisible by 7 and save them into a new array. For your convenience, I've declared the new
   * array, but it's up to you to initialize it. The new array does not have to be the same size as
   * the original. Any values that are not divisible by seven should be represented as zeros in the
   * divisible sequence For instance, if a sequence of [7,9,14,20,21] ===> [7, 0, 14, 0, 21] Bonus
   * points if you can get it so that the new array has no empty "zero" spaces [7,9,14,20,21] ===>
   * [7, 14, 21]
   */
  public static int[] findDivisibleBySeven(int[] sequence) {
    int[] divisibleBySeven = new int[sequence.length];

    // {0, 0, 0, 0 , 0}
    for (int i = 0; i < divisibleBySeven.length; i++) {
      if (divisibleBySeven[i] % 7 != 0) {
        divisibleBySeven[i] = 0;
      } else {
        divisibleBySeven[i] = sequence[i];
      }
    }
    return divisibleBySeven;
  }

  public static int[] findDivisibleBySevenNoZeros(int[] sequence) {
    int[] divisibleBySeven = new int[sequence.length];
    for (int i = 0; i < divisibleBySeven.length; i++) {}

    return divisibleBySeven;
  }
  // =================== Testing/Output methods below! ===================

  // A quick testing method for development
  // Gives your find divisible by seven a sequence array and then prints the output
  // You can
  public static void divisibleOutput() {

    int[] sequence = {
      35, 89, 53, 36, 52, 74, 19, 45, 1, 69,
      40, 63, 2, 91, 48, 5, 56, 11, 68, 90,
      42, 85, 78, 72, 14, 59, 18, 28, 92, 22,
      27, 98, 97, 96, 29, 46, 55, 31, 67, 70,
      84, 43, 71, 13, 49, 50, 51, 100, 79, 82,
      37, 39, 3, 77, 12, 58, 87, 17, 9, 33,
      15, 7, 4, 83, 20, 81, 64, 66, 54, 30,
      23, 10, 26, 60, 93, 32, 61, 34, 75, 62,
      24, 25, 94, 8, 65, 80, 86, 47, 76, 21,
      95, 99, 44, 73, 38, 88, 6, 57, 16, 41
    };

    int[] divisibleBySeven = findDivisibleBySeven(sequence);

    System.out.println(Arrays.toString(divisibleBySeven));
  }

  // Yeah, yeah, this one doesn't really do anything, but naming convention!
  public static void practiceOutput() {
    practice();
  }
}
