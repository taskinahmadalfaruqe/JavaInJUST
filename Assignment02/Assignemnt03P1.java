import java.util.Scanner;

public class Assignemnt03P1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] scores = new int[3][3];

        String[] students = {"Student 1", "Student 2", "Student 3"};
        String[] courses = {"Java", "Database", "Network"};

        // Input scores
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter scores for " + students[i]);

            for (int j = 0; j < 3; j++) {
                System.out.print(courses[j] + ": ");
                scores[i][j] = input.nextInt();
            }
        }

        // Display scores
        System.out.println("\nStudent Scores:");

        for (int i = 0; i < 3; i++) {
            System.out.print(students[i] + " -> ");

            for (int j = 0; j < 3; j++) {
                System.out.print(courses[j] + ": " + scores[i][j] + "  ");
            }

            System.out.println();
        }

        input.close();
    }
}