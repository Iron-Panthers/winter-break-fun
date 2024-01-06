package winterbreakstudying;

import winterbreakstudying.GeneralLogicProblems.GeneralLogicProblems;

public class Main {
  public static void main(String[] args) {
    System.out.println("I did your problems brandon");
    
    GeneralLogicProblems.printPyramid(3);
    GeneralLogicProblems.printPyramid(10);
    String[] mostFreqProb = {"I", "Just", "Love", "To", "Write", "A", "Bunch", "Of", "Words", "Oh", "How", "I", "Just", "Love", "To", "Do", "This", "At", "Almost", "Midnight", ";("};
    System.out.println(GeneralLogicProblems.mostFrequent(mostFreqProb));

    System.out.println("I will finaly have enough money to buy a burger in 2050 ;), money: 1, interest: 5%, MONEY IN 2050: " + GeneralLogicProblems.interestCalculator(1, 2050 - 2024, .05d));
  }
}
