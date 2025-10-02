import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input User details
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (cm): ");
        float height = sc.nextFloat();
        sc.nextLine(); // consume leftover newline

        // Create User object
        User user = new User(name, age, weight, height);
        System.out.println("\n=== User Details ===");
        user.displayUser();

        // Input Workout details
        System.out.print("\nEnter workout name: ");
        String workoutName = sc.nextLine();

        System.out.print("Enter duration (minutes): ");
        int duration = sc.nextInt();

        System.out.print("Enter calories burned: ");
        int caloriesBurned = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Workout workout = new Workout(workoutName, duration, caloriesBurned);
        System.out.println("\n=== Workout Details ===");
        workout.displayWorkout();

        // Input DietPlan details
        System.out.print("\nEnter meal name: ");
        String mealName = sc.nextLine();

        System.out.print("Enter calories: ");
        int calories = sc.nextInt();

        System.out.print("Enter protein (g): ");
        int protein = sc.nextInt();

        System.out.print("Enter carbs (g): ");
        int carbs = sc.nextInt();

        System.out.print("Enter fats (g): ");
        int fats = sc.nextInt();

        Dietplan diet = new Dietplan(mealName, calories, protein, carbs, fats);
        System.out.println("\n=== Diet Details ===");
        diet.displayMeal();

        // Show total users
        System.out.println("\nTotal Users: " + User.getTotalUsers());

        sc.close();
    }
}
