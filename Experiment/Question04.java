// Calcualte the sum form the input digits

import java.util.Scanner;

public class Question04 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num = sc.nextInt();
    int value = num;
    int sum = 0;

    while (value > 0) {
      sum += value % 10;
      value /= 10;
    }

    System.out.println("Sum of digits " + (num) + ": " + sum);
  }
}
