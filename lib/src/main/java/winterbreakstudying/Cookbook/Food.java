package winterbreakstudying.Cookbook;

public class Food {

  // Declare 4 private instance variables for:
  // String - Name of your food
    private String name;
  // String - The amount of time needed to create your dish
    private String prepTime;
  // String[] - An string array contianing the ingredients of the dish
    private String[] ingredients;
  // double - A rating (out of 5 stars)
    private double rating;

  // Create a zero-arg constructor
  public Food() {}

  // Create a multi arg constructor

  public Food(String name, String prepTime, String[] ingredients, double rating) {
    this.name = name;
    this.prepTime = prepTime;
    this.ingredients = ingredients;
    this.rating = rating;
  }

  // Fill out these getters and setters for all of your instance vaiables

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPrepTime() {
    return prepTime;
  }

  public void setPrepTime(String prepTime) {
    this.prepTime = prepTime;
  }

  public String[] getIngredients() {
    return ingredients;
  }

  public void setIngredients(String[] ingredients) {
    this.ingredients = ingredients;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }
}
