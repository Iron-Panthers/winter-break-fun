package winterbreakstudying;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import winterbreakstudying.Cookbook.Cookbook;
import winterbreakstudying.Cookbook.Food;

public class CookbookTest {

  @Test
  public void genericStudentTests() {

    ArrayList<Food> dishesList = new ArrayList<>();

    Food[] dishesArray = {
      new Food("Pizza", 3.0, (new String[] {"dough", "tomato sauce", "cheese"}), 4.5),
      new Food("Pasta", 2.0, (new String[] {"water", "flour", "alfredo sauce"}), 4.8),
      new Food("Butter", 5.0, (new String[] {"milk"}), 3.5),
      new Food(
          "Iron Panther Soup",
          1.0,
          (new String[] {"blood", "sweat", "tears", "metal shavings", "disappointment"}),
          5),
      new Food(
          "Turkey Sandwich",
          0.3,
          (new String[] {"turkey", "mayonaise", "cheese", "white bread"}),
          4),
      new Food(
          "Cake", 7.5, (new String[] {"flour", "sugar", "eggs", "chocolate", "milk"}), 5),
      new Food("Fried Liver", 9.0, (new String[] {"liver", "oil", "garlic"}), 1.5)
    };

    for (Food food : dishesArray) {
      dishesList.add(food);
    }

    // Creating cookbooks
    // Cookbook userCookbook = new Cookbook(dishesList);
    Cookbook userCookbook = new Cookbook(dishesList);

    assertEquals("Iron Panther Soup", userCookbook.findHighestRatedDish().getName());

    userCookbook.purgeCookbook(4.5);

    String[] purgedFoodNames = new String[userCookbook.getFoods().size()];

    for (int i = 0; i < purgedFoodNames.length; i++) {
      purgedFoodNames[i] = userCookbook.getFoods().get(i).getName();
    }

    assertArrayEquals(
        new String[] {"Pizza", "Pasta", "Iron Panther Soup", "Cake"}, purgedFoodNames);
  }
}
