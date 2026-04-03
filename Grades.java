import java.util.*;

public class Grades {

    public static void main(String[] args) {

        // a. Create a map which stores names of students associated with their GPA
        Map<String, Double> students = new HashMap<>();

        // b. Add some students to the map
        students.put("Ali", 3.5);
        students.put("Leyla", 3.9);
        students.put("Murad", 2.8);
        students.put("Aysel", 3.9);
        students.put("Farid", 3.2);
        students.put("Nigar", 2.5);

        // Print all students
        System.out.println("Students and GPAs:");
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // c. Find the student(s) with the highest GPA
        double maxGpa = Collections.max(students.values());

        System.out.println("\nStudent(s) with highest GPA:");
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() == maxGpa) {
                System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
            }
        }

        // d. Find the average GPA of all students
        double sum = 0;
        for (double gpa : students.values()) {
            sum += gpa;
        }

        double averageGpa = sum / students.size();
        System.out.println("\nAverage GPA: " + averageGpa);

        // e. Find the number of students who have less GPA than the average
        int countBelowAverage = 0;

        for (double gpa : students.values()) {
            if (gpa < averageGpa) {
                countBelowAverage++;
            }
        }

        System.out.println("\nNumber of students below average GPA: " + countBelowAverage);
    }
}