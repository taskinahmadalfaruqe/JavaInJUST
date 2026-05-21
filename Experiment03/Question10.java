import java.util.Random;
public class Question10 {
    static char letter;
    static {
        Random rand = new Random();
        letter = (char)('A' + rand.nextInt(26));
    }
    public static void main(String[] args) {
        System.out.println("Random Letter: " + letter);
    }
}