public class NestedWhileLoop {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        outerLoop:
        while (i < 10) {
            j = 0; 

            while (j < 10) {
                if (j == 5) {
                    break outerLoop;
                }
                System.out.println(i + j);
                j++;
            }
            i++;
        }
        
        System.out.println("Exited both loops.");
    }
}