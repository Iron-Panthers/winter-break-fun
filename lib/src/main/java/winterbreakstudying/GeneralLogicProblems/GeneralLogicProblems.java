package winterbreakstudying.GeneralLogicProblems;
import java.util.HashMap;

public class GeneralLogicProblems {

  /**
   * Should take two arrays and then find the sums of each array Returns true if the first array's
   * sum is larger, false if it's they are equal or the second array sum is larger
   */
  public static boolean isFirstSumLarger(int[] arr1, int[] arr2) {
    int sum1 = 0;
    int sum2 = 0;
    for (int i = 0; i < arr1.length; i++){
      sum1 += arr1[i];
    }
    //dunno if theyre different lengths
    for (int i = 0; i < arr2.length; i++){
      sum2 += arr2[i];
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
    //spaces increment by -1 as we go down
    //asterisks increment by 2 as we go down
    for (int level = 0; level < levels; level++){
      for (int space = 0; space < levels - level - 1; space++){
        System.out.print(" ");
      }
      for (int star = 0; star < (level * 2) + 1; star++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // Takes in a list of strings, returns the most frequent word (string)
  // Try using a hashmap!
  public static String mostFrequent(String[] words) {
    HashMap<String, Integer> wordList = new HashMap<>();
    for (String word : words){
      if (wordList.containsKey(word)){
        wordList.put(word, wordList.get(word) + 1);
      } else{
        wordList.put(word, 1);
      }
    }
    String mostFrequent = "";
    int maxCount = 0;
    for (String word : wordList.keySet()){
      if (wordList.get(word) > maxCount) {
        maxCount = wordList.get(word);
        mostFrequent = word;
      }
    }
    return mostFrequent;
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
    return deposit * Math.pow((1 + (interest * 0.01)), years);
  }
}
