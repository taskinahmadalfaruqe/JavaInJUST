import java.util.Scanner;

public class Question03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = sc.nextInt();

    System.out.print("Enter Second number: ");
    int b = sc.nextInt();

    String result = (a > b)
      ? "A is greater"
      : (a < b)
        ? "B is greater"
        : "Equal";
    System.out.println(result);
  }
}
