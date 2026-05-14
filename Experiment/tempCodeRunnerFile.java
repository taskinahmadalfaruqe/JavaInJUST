public class RemoveDuplicateElement {

  public static void main(String[] args) {
    String[] arr = { "a", "b", "c", "a", "c" };
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i].equals(arr[j])) {
          System.out.println("The duplicate element is " + arr[i]);
        }
      }
    }
  }
}
