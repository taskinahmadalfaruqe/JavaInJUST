import java.util.Arrays;

public class ShortNumberAndStringArray {

  public static void main(String[] args) {
    // Numeric array
    int[] numbers = { 5, 2, 9, 1, 3 };
    Arrays.sort(numbers);
    System.out.println("Sorted Numeric Array:");
    for (int num : numbers) {
      System.out.print(num + " ");
    }
    System.out.println();

    // String array
    String[] names = { "Banana", "Apple", "Mango", "Cherry" };
    Arrays.sort(names);
    System.out.println("Sorted String Array:");
    for (String name : names) {
      System.out.print(name + " ");
    }
  }
}
