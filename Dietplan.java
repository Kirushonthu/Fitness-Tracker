public class Dietplan {
    // Fields
    private String mealName;
    private int calories;
    private int protein; 
    private int carbs;   
    private int fats;    

    // Constructor (parameterized)
    public Dietplan(String mealName, int calories, int protein, int carbs, int fats) {
        this.mealName = mealName;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fats = fats;
    }

    // Getters and setters
    public String getMealName() {
        return mealName;
    }
    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getProtein() {
        return protein;
    }
    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getCarbs() {
        return carbs;
    }
    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getFats() {
        return fats;
    }
    public void setFats(int fats) {
        this.fats = fats;
    }

    // Method to display diet details
    public void displayMeal() {
        System.out.println("Meal: " + mealName +
                           " | Calories: " + calories +
                           " | Protein: " + protein + "g" +
                           " | Carbs: " + carbs + "g" +
                           " | Fats: " + fats + "g");
    }
}
