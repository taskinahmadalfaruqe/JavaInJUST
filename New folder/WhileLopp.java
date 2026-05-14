public class WhileLopp {

  public static void main(String[] args) {
    int i = 1;
    int sum = 0;
    while (i < 11) {
      sum += i;
      i++;
    }
    System.out.println("The sum of first 10 natural numbers is: " + sum);
  }
}
