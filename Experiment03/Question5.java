import java.util.Random;

public class Question5 {

    public static String verificationCode() {

        String chars =
                "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        Random rand = new Random();

        String code = "";

        for(int i = 0; i < 5; i++) {
            code += chars.charAt(rand.nextInt(chars.length()));
        }

        return code;
    }

    public static void main(String[] args) {
        System.out.println("Verification Code: " + verificationCode());
    }
}