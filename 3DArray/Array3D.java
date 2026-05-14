public class Array3D {
    public static void main(String[] args) {
        int[][][] array3D = new int[2][3][4];

        // Initialize the 3D array with some values
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k] = i + j + k; // Just an example value
                }
            }
        }

        // Print the 3D array
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}