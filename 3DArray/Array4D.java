public class Array4D {
    public static void main(String[] args) {
        int[][][][] array4D = new int[5][6][7][8];

        // Initialize the 4D array with some values
        for (int i = 0; i < array4D.length; i++) {
            for (int j = 0; j < array4D[i].length; j++) {
                for (int k = 0; k < array4D[i][j].length; k++) {
                    for (int l = 0; l < array4D[i][j][k].length; l++) {
                        array4D[i][j][k][l] = i + j + k + l; // Just an example value
                    }
                }
            }
        }

        // Print the 4D array
        for (int i = 0; i < array4D.length; i++) {
            for (int j = 0; j < array4D[i].length; j++) {
                for (int k = 0; k < array4D[i][j].length; k++) {
                    for (int l = 0; l < array4D[i][j][k].length; l++) {
                        System.out.print(array4D[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}