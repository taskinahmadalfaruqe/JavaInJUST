public class Assignemnt03P2 {
    public static void main(String[] args) {

        int[][] scores = {
                {95, 90, 92},
                {80, 75, 96},
                {98, 97, 96}
        };

        String[] students = {"Student 1", "Student 2", "Student 3"};
        String[] courses = {"Java", "Database", "Network"};

        // Average score of each student
        System.out.println("Average Score of Each Student:");

        for (int i = 0; i < 3; i++) {

            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }

            double average = total / 3.0;

            System.out.println(students[i] + ": " + average);
        }

        // Average score of each course
        System.out.println("\nAverage Score of Each Course:");

        for (int j = 0; j < 3; j++) {

            int total = 0;

            for (int i = 0; i < 3; i++) {
                total += scores[i][j];
            }

            double average = total / 3.0;

            System.out.println(courses[j] + ": " + average);
        }
    }
}