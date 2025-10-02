public class User {
    // Fields
    private String name;
    private int age;
    private double weight;
    private float height;

    // Static variables
    static int totalUsers;
    static String appName;

    // Static block
    static {
        appName = "Fitness Tracker";
        System.out.println("Application loaded: " + appName);
    }

    // Default constructor
    User() {
        totalUsers++;
    }

    // Parameterized constructor
    User(String name, int age, double weight, float height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        totalUsers++;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Static method to return totalUsers
    public static int getTotalUsers() {
        return totalUsers;
    }

    // Method to display user details
    public void displayUser() {
        System.out.println("Name: " + name + ", Age: " + age + ", Weight: " + weight + "kg, Height: " + height + "cm");
    }
}
                