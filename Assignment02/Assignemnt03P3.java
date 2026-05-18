public class Assignemnt03P3 {
    public static void main(String[] args) {

        int[][] scores = {
                {95, 90, 92},
                {80, 75, 96},
                {98, 97, 96}
        };

        String[] students = {"Student 1", "Student 2", "Student 3"};
        String[] courses = {"Java", "Database", "Network"};

        for (int j = 0; j < 3; j++) {

            System.out.println("\nRanking for " + courses[j]);

            for (int rank = 1; rank <= 3; rank++) {

                int highest = -1;
                int studentIndex = -1;

                for (int i = 0; i < 3; i++) {

                    if (scores[i][j] > highest) {
                        highest = scores[i][j];
                        studentIndex = i;
                    }
                }

                System.out.println("Rank " + rank + ": "
                        + students[studentIndex]
                        + " - " + highest);

                scores[studentIndex][j] = -1;
            }
        }
    }
}