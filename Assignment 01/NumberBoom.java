import java.util.Scanner;

public class GameDeveleopmentNumberBoom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the secret number: ");
        int secret = sc.nextInt();

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        int baseNumber = 0;
        int LimitNumber = limit;

        while (true) {
            System.out.print("Guess: ");
            int guess = sc.nextInt();

            if (guess == secret) {
                System.out.println("BOOM " + secret);
                break;
            } 
            else if (guess < secret) {
                baseNumber = guess;
                System.out.println("Range is: " + baseNumber + " to " + LimitNumber);
            } 
            else {
                LimitNumber = guess;
                System.out.println("Range is: " + baseNumber + " to " + LimitNumber);
            }
        }

        sc.close();
    }
}