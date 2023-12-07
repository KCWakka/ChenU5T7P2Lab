public class Student {
    private static int greatestPoints = 0;
    private static int totalPointsEarned = 0;
    private String firstName;
    private int points;
    public Student(String name) {
        firstName = name;
        points = 0;
    }
    public static int getTotalPointsEarned() {
        return totalPointsEarned;
    }
    public static int getGreatestPoints() {
        return greatestPoints;
    }
    public String studentInfo() {
        return "Student: " + firstName + "\nStudent's Points: " + points;
    }
    public void addPoints(int points) {
        this.points += points;
        if (this.points > greatestPoints) {
            greatestPoints = this.points;
        }
        totalPointsEarned += points;
    }
    public static String classInfo() {
        return "Total points earned by all students: " + getTotalPointsEarned() +
                "\nMost points earned by any student: " + getGreatestPoints();
    }

}
