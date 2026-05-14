public class DoWhile {

  public static void main(String[] args) {
    int sum = 0;
    int i = 1;
    do {
      sum += i;

      i++;
    } while (i < 11);
    System.out.println("The sum of first 10 natural numbers is: " + sum);
  }
}
