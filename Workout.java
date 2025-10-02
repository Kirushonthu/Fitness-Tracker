public class Workout {
    // Fields
    private String workoutName;
    private int duration; // minutes
    private int caloriesBurned;

    // Constructor (parameterized)
    public Workout(String workoutName, int duration, int caloriesBurned) {
        this.workoutName = workoutName;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    // Getters and setters
    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    // Method to display workout details
    public void displayWorkout() {
        System.out.println("Workout: " + workoutName +
                           " | Duration: " + duration + " mins" +
                           " | Calories Burned: " + caloriesBurned);
    }
}
