import java.util.Scanner;

public class onlyIf {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a > b) {
      if (a > c) {
        System.out.println("The greatest number is: " + a);
      }
    }
    if (b > c) {
      if (b > a) {
        System.out.println("The greatest number is: " + b);
      }
    }
    if (c > a) {
      if (c > b) {
        System.out.println("The greatest number is: " + c);
      }
    }
  }
}
