package winterbreakstudying;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import winterbreakstudying.GeneralLogicProblems.GeneralLogicProblems;
import winterbreakstudying.Solutions.GeneralLogicProblemsSolutions;

public class GeneralProblemTests {

  @Test
  public void sumCheckedCases() {

    int[] smaller = {4, 1, 3, 6, 2, 1, 7, 4, 6};

    int[] bigger = {100, 1222, 33};

    // Testing if you have covered the basics
    assertEquals(true, GeneralLogicProblems.isFirstSumLarger(bigger, smaller));

    assertEquals(false, GeneralLogicProblems.isFirstSumLarger(smaller, bigger));

    // Checking equivalent array sums
    assertEquals(
        false,
        GeneralLogicProblems.isFirstSumLarger(smaller, smaller),
        "remember, the first array needs to be greater than, not greater than or equal to, array 2");

    // Checking empty array
    int[] emptyArray = new int[0];
    assertEquals(
        false,
        GeneralLogicProblems.isFirstSumLarger(emptyArray, bigger),
        "what if one array has no elements inside?");

    // Checking negatives
    int[] negativeArray = {-1, 2, -1000, -33, -44};

    assertEquals(true, GeneralLogicProblems.isFirstSumLarger(smaller, negativeArray));
  }

  @Test
  public void sumRandomCases() {
    for (int k = 0; k < 10; k++) {
      int rand1Length = (int) (Math.random() * 10 + 1);

      int[] arr1 = new int[rand1Length];

      for (int i = 0; i < arr1.length; i++) {
        arr1[i] = (int) (Math.random() * 200 - 100);
      }

      int rand2Length = (int) (Math.random() * 10 + 1);

      int[] arr2 = new int[rand2Length];

      for (int i = 0; i < arr2.length; i++) {
        arr2[i] = (int) (Math.random() * 200 - 100);
      }

      assertEquals(
          GeneralLogicProblemsSolutions.isFirstSumLarger(arr1, arr2),
          GeneralLogicProblems.isFirstSumLarger(arr1, arr2));
    }
  }

  @Test
  public void mostFrequent() {
    String[] general = {"a", "a", "a", "a", "a", "b"};

    String[] random = {"apple", "pear", "banana", "cat", "dog", "apple", "mouse"};

    // Generic, easy cases
    assertEquals("a", GeneralLogicProblems.mostFrequent(general));

    assertEquals("apple", GeneralLogicProblems.mostFrequent(random));
  }

  @Test
  public void interestCalculator() {
    // Generic case
    assertEquals(1.01, GeneralLogicProblems.interestCalculator(1, 1, 1));

    assertEquals(
        GeneralLogicProblemsSolutions.interestCalculator(10, 10, 10),
        GeneralLogicProblems.interestCalculator(10, 10, 10));

    assertEquals(
        GeneralLogicProblemsSolutions.interestCalculator(1000, 55, 550),
        GeneralLogicProblems.interestCalculator(1000, 55, 550));
  }
}
