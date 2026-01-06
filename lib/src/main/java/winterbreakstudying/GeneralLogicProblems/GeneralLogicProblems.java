package winterbreakstudying.GeneralLogicProblems;
import java.util.HashMap;

public class GeneralLogicProblems {
  public static int sumOfArr1;
  public static int sumOfArr2;

    /**
     * Should take two arrays and then find the sums of each array Returns true if the first array's        /
     * sum is larger, false if it's they are equal or the second array sum is larger                      \/  
     */                                                                      
    public static boolean isFirstSumLarger(int[] arr1, int[] arr2) {
      for (int i = 0; i < arr1.length; i++) {  //getting sum of arr1
        sumOfArr1 = sumOfArr1 + arr1[i];
      }

      for (int i = 0; i < arr2.length; i++) {  //getting sum of arr2
        sumOfArr2 = sumOfArr2 + arr1[i];
      }

      if (sumOfArr1 > sumOfArr2) {  //checking which array is larger
        return true;
      } else {
        return false;
      }
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
    for (int rows = 1; rows < levels; rows++) {
      
      for (int spaces = 0; spaces < levels - rows; spaces++) {
        System.out.print(" ");
      }

      for (int star = 0; star < 2 * rows - 1; star++) {
        System.out.print("*");
      }

      System.out.println();
    }

    System.out.println("Iron Panthers");
  }

  // Takes in a list of strings, returns the most frequent word (string)
  // Try using a hashmap!
  static HashMap<String, Integer> wordCount = new HashMap<>();
  
    public static String mostFrequent(String[] words) {
      for (String word : words) {
        if (wordCount.containsKey(word)) {
          wordCount.put(word, wordCount.get(word)+1);
        } else {
          wordCount.put(word, 1);
        }
    }
    return "";
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
    return deposit * Math.pow((1 + (interest/100)), years);
  }
}
