// INPUT 1 disi and calculate it 10 times
import java.util.Scanner;

public class Question02 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = sc.nextInt();

    for (int i = 1; i < 11; i++) {
      System.out.println(a + " * " + i + " = " + (a * i));
    }
  }
}
