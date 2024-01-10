package winterbreakstudying.Solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPracticeSolutions {

  // These are the solutions I expect
  public static void practiceSolution1() {
    // Initialize me with these values: 3, 5, 10
    int[] arr = new int[3];
    arr[0] = 3;
    arr[1] = 5;
    arr[2] = 10;

    // Print out each value in the array with a for loop
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    // Change the value of 10 ==> 7
    // (value 10 is stored at index 2, look up!!)
    arr[2] = 7;

    // Print out the length of the array
    System.out.println(arr.length);

    // Multiply all the values in the array by 2 using a for loop
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] * 2;
    }

    // Print out again to check if the multiplication worked (for your convenience)
    System.out.println(Arrays.toString(arr));
  }

  // The "cooler" way, but it's totally ok if your solutions are like practice1
  public static void practiceSolution2() {
    // Initialize me with these values: 3, 5, 10
    int[] arr = {3, 5, 10};

    // Print out each value in the array with a for loop
    for (int num : arr) {
      System.out.println(num);
    }

    // Change the value of 10 ==> 7
    arr[2] = 7;

    // Print out the length of the array
    System.out.println(arr.length);

    // Multiply all the values in the array by 2 using a for loop
    for (int i = 0; i < arr.length; i++) {
      arr[i] *= 2;
    }
  }

  public static int[] findDivisibleBySevenSolution(int[] sequence) {

    // Creates a new array to hold the numbers divisible by seven
    int[] divisibleBySeven = new int[sequence.length];

    // Iterating over the original sequence
    for (int i = 0; i < sequence.length; i++) {

      // If the number is divisible by 7, add it to the array
      if (sequence[i] % 7 == 0) {
        divisibleBySeven[i] = sequence[i];
      } else {
        // Otherwise, just leave a zero
        divisibleBySeven[i] = 0;
      }
    }

    return divisibleBySeven;
  }

  // No zeros!
  public static int[] findDivisibleBySevenSolutionNoZeros1(int[] sequence) {

    // First, we should find how many numbers are divisible by seven
    int numDivisibleBySeven = 0;

    // Just go through the sequence and count up how many numbers are divisible by 7
    for (int i = 0; i < sequence.length; i++) {
      if (sequence[i] % 7 == 0) {
        numDivisibleBySeven++;
      }
    }

    // Create that array knowing how many numbers are divisible by 7
    int[] divisibleBySeven = new int[numDivisibleBySeven];

    // Need to find our index within the new divisible-by-seven array
    int divisibleBySevenCounter = 0;

    for (int num : sequence) {
      if (num % 7 == 0) {
        // After every time we find a new multiple of seven, we'll increment the index
        // That way, we fill every space within our new array, without leaving zeros

        divisibleBySeven[divisibleBySevenCounter] = num;

        divisibleBySevenCounter++;
      }
    }

    return divisibleBySeven;
  }

  // Arraylists make everything easier
  // We don't have to do any index trickery, as the arraylist can resize based on new numbers
  public static int[] findDivisibleBySevenSolutionNoZeros2(int[] sequence) {

    // Create new arraylist
    ArrayList<Integer> divisibleBySeven = new ArrayList<Integer>();

    // Add all numbers divisible by seven to arraylist
    for (int num : sequence) {
      if (num % 7 == 0) {
        divisibleBySeven.add(num);
      }
    }

    // Create a new array the same size as the final arraylist
    int[] container = new int[divisibleBySeven.size()];

    // Add all the numbers to the array
    // (this basically iterates over the arraylist and puts the number into the array)
    for (int i = 0; i < divisibleBySeven.size(); i++) {
      container[i] = divisibleBySeven.get(i);
    }

    return container;
  }
}
