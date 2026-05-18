import java.util.Random;
import java.util.Scanner;

public class Assignment02 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Generate random numbers from 0 to 100
        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);

        // Random operator
        int choice = random.nextInt(4);

        char operator = '+';
        double correctAnswer = 0;

        switch (choice) {
            case 0:
                operator = '+';
                correctAnswer = num1 + num2;
                break;

            case 1:
                operator = '-';
                correctAnswer = num1 - num2;
                break;

            case 2:
                operator = '*';
                correctAnswer = num1 * num2;
                break;

            case 3:
                operator = '/';

                // Avoid division by zero
                while (num2 == 0) {
                    num2 = random.nextInt(101);
                }

                correctAnswer = (double) num1 / num2;
                break;
        }

        // Ask question
        System.out.print("What is " + num1 + " " + operator + " " + num2 + " ? ");

        double userAnswer = input.nextDouble();

        // Check answer
        if (userAnswer == correctAnswer) {
            System.out.println("You are right");
        } else {
            System.out.println("You are wrong");
            System.out.println("Correct answer is: " + correctAnswer);
        }

        input.close();
    }
}