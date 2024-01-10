package winterbreakstudying.Solutions;

public class FoodSolutions {

  // Declare 4 private instance variables for:
  // String - Name of your food
  // String - The amount of time needed to create your dish
  // String[] - An string array contianing the ingredients of the dish
  // double - A rating (out of 5 stars)

  private String name;
  private String prepTime;
  private String[] ingredients;

  private double rating;

  // Create a zero-arg constructor
  public FoodSolutions() {
    this.name = "cookies";
    this.prepTime = "3 hours";

    String[] ingredients = {"eggs", "flour", "sugar", "milk"};

    this.ingredients = ingredients;

    this.rating = 5;
  }

  // Create a multi arg constructor

  public FoodSolutions(String name, String prepTime, String[] ingredients, double rating) {
    this.name = name;
    this.prepTime = prepTime;
    this.ingredients = ingredients;
    this.rating = rating;
  }

  // These are all just getters and setters

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPrepTime() {
    return this.prepTime;
  }

  public void setPrepTime(String prepTime) {
    this.prepTime = prepTime;
  }

  public String[] getIngredients() {
    return this.ingredients;
  }

  public void setIngredients(String[] ingredients) {
    this.ingredients = ingredients;
  }

  public double getRating() {
    return this.rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }
}
