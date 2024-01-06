package winterbreakstudying.GeneralLogicProblems;

import java.util.HashMap;

public class GeneralLogicProblems {

  /**
   * Should take two arrays and then find the sums of each array Returns true if the first array's
   * sum is larger, false if it's they are equal or the second array sum is larger
   */
  public static boolean isFirstSumLarger(int[] arr1, int[] arr2) {
    return sumArr(arr1) > sumArr(arr2);
  }

  public static int sumArr(int[] arr){
    int sum = 0;
    for(int i : arr){
      sum += i;
    }
    return sum;
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
    //ok brandon, it doesnt seem that hard of a task
    //lets see, the dots are allways level * 2 - 1 right?
    //so we just find the max and then loop, get the amount of dots, and then center it

    int width = dotsForLevel(levels);
    for(int i = 1; i <= levels; i++){
      int dots = dotsForLevel(i);
      int space = (width - dots) / 2;
      //print it
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < dots; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }
      System.out.println();//enter onto next line btw i looked at your solution, that sure is a lot of green
    }
    //easy
    
  }

  public static int dotsForLevel(int level){
    return level * 2 - 1;
  }

  // Takes in a list of strings, returns the most frequent word (string)
  // Try using a hashmap! -- DUDE, i have literally never had to use a hashmap in my life this is crazy
  //Oh crap i just realized i have, a lot. Its just called something different in c#
  public static String mostFrequent(String[] words) {
    HashMap<String, Integer> frequencies = new HashMap<String, Integer>();
    for(String s : words){
      if(frequencies.containsKey(s)){
        frequencies.replace(s,  frequencies.get(s) + 1);
      }else{
        frequencies.put(s, 1);
      }
    }
    String mostFrequent = "";
    int highestFrequency = 0;

    for(String s : frequencies.keySet()){
      if(frequencies.get(s) > highestFrequency){
       highestFrequency = frequencies.get(s);
       mostFrequent = s;
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
  public static double interestCalculator(double deposit, int years, double interest) {//intrerest in percent as shown by your explanation
    return deposit * Math.pow(1 + interest, years);
  }
}
