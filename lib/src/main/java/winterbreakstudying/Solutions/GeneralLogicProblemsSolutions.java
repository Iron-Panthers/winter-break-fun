package winterbreakstudying.Solutions;

import java.util.HashMap;

public class GeneralLogicProblemsSolutions {

  /**
   * Should take two arrays and then find the sums of each array Returns true if the first array's
   * sum is larger, false if it's they are equal or the second array sum is larger
   */
  public static boolean isFirstSumLarger(int[] arr1, int[] arr2) {

    int sum1 = 0;
    int sum2 = 0;

    for (int num : arr1) {
      sum1 += num;
    }

    for (int num : arr2) {
      sum2 += num;
    }

    return sum1 > sum2;
  }

  // Prints out a pyramid with asterisks based on the number of levels
  // The pyramid is always centered
  // For instance, a pyramid with level 3 would look like
  //   *
  //  ***
  // *****

  // The bottom-most layer should have no spaces - only asterisks

  // Also, haha, the unit test for this was HELL, so no unit test lol, just try testing it in main
  // and see if it's what you expect...
  // Importing a class and calling a static method should be relatively simple at this point
  public static void printPyramid(int levels) {

    // The max width of the pyramid depends on how many levels there are
    // If one level has 1 slot, two levels, have 3 slots, and 3 levels have 5 slots, you can see
    // that each level adds two to the max width of the pyramid. Therefore, the max slots should be
    // (2 * levels) - 1
    int maxSlots = (levels * 2) - 1;

    // Print out each level
    for (int i = 1; i <= levels; i++) {
      // The number of spaces on either side of the asterisks should be the max width - the amount
      // of asterisks. To calculate the amount of asterisks, we can use a similar formula to the max
      // slots. Just think about how the first level always has 1 asterisk, the second always has 3
      // asterisks, and the third has 5 asterisks
      int numSpaces = maxSlots - ((i * 2) - 1);

      // The number of spaces on either side of the asterisks should be the number of spaces divided
      // by 2
      int numSpacesOnOneSide = numSpaces / 2;

      // Creating the left spaces
      for (int k = 0; k < numSpacesOnOneSide; k++) {
        System.out.print(" ");
      }

      // Creating the asterisks (using our asterisk formula)
      for (int k = 0; k < ((i * 2) - 1); k++) {
        System.out.print("*");
      }

      // Creating the right spaces
      for (int k = 0; k < numSpacesOnOneSide; k++) {
        System.out.print(" ");
      }

      // New line for formatting
      System.out.println();
    }
  }

  // Takes in a list of strings, returns the most frequent word (string)
  // Try using a hashmap!
  public static String mostFrequent(String[] words) {

    // Creates a map to store all the words and how many times we've seen it
    HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

    // Iterating over all words
    for (String word : words) {
      // If the hashmap already contains the word, just add 1 to the times we've seen it
      if (wordMap.containsKey(word)) {
        int incrementedCount = wordMap.get(word) + 1;
        wordMap.put(word, incrementedCount);
      } else {

        // Otherwise, intialize the amount of times we've seen this word with zero
        wordMap.put(word, 1);
      }
    }

    // Similar to the cookbook, we need to find which string occurred the most
    int highestOccurenceNum = 0;
    String mostFrequentString = "";

    // Iterate over every key in the hashmap
    for (String word : wordMap.keySet()) {

      // Find how often that string has appeared
      int wordOccurenceNum = wordMap.get(word);

      // If it's the most often, then set it as the most frequent string
      if (wordOccurenceNum > highestOccurenceNum) {
        highestOccurenceNum = wordOccurenceNum;
        mostFrequentString = word;
      }
    }

    return mostFrequentString;
  }

  /**
   * Banking time! Business needs you to write some logic. They want to make a deposit into the bank
   * of pants, but they want to know how much money they will get. Given an initial amount of money,
   * how many years this money is in the bank, and an interest rate, calculate the final amount of
   * money
   *
   * @param deposit - Initial amount of money
   * @param years - How many years this money is sitting
   * @param interest - The amount of interest, compounded annually. Represented as a percent, so 1
   *     is 1% interest and 55 is 55% interest
   * @return The total amount of money would one have after all these years of interest
   */
  public static double interestCalculator(double deposit, int years, double interest) {
    // Initial amount multiplied by the amount of interest

    // Imagine 5 percent interest every year
    // That's multiplying 1.05 annually (so we add 1 to (5/100))
    // Then, let's say it's compounded by 10 years
    // We need to multiply the amount by 1.05, 10 times
    // We could use a for loop, but really multiplying 1.05 by itself several times is the same as
    // raising it to some power
    // So we'll just raise 1.05 to the 10th power and multiply it all together

    return deposit * Math.pow((1 + (interest / 100)), years);
  }
}
