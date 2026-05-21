import java.util.Random;

public class Question7 {

    char letter;

    public Question7() {
        Random rand = new Random();
        letter = (char)('A' + rand.nextInt(26));
    }

    void display() {
        System.out.println("Random Letter: " + letter);
    }

    public static void main(String[] args) {
        Question7 obj = new Question7();
        obj.display();
    }
}