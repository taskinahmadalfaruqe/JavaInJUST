import java.util.Random;

public class Question2 {

    public static char randomLetter() {
        Random rand = new Random();
        return (char) ('A' + rand.nextInt(26));
    }

    public static void main(String[] args) {

        System.out.println("Random Letter: " + randomLetter());
    }
}