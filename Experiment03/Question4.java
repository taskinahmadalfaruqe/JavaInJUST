import java.util.Scanner;

public class Question4 {

    public static char toLowerCase(char ch) {
        return Character.toLowerCase(ch);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Uppercase Letter: ");
        char ch = sc.next().charAt(0);

        System.out.println("Lowercase Letter: " + toLowerCase(ch));
    }
}