public class ForLoop {
    public static void main(String[] args) {
        int a = 0;

        System.out.println("--- For Loop ---");
        for (; a <= 10; ) {
            System.out.println(a);
            a = a + 2;
        }

        // RESET a back to 0
        a = 0; 
        System.out.println("--- While Loop ---");
        while (a <= 10) {
            System.out.println(a);
            a = a + 2;
        }

        // RESET a back to 0
        a = 0;
        System.out.println("--- Do-While Loop ---");
        do {
            System.out.println(a);
            a = a + 2;
        } while (a <= 10);
    }
}