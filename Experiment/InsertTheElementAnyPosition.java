import java.util.Arrays;

public class InsertTheElementAnyPosition {

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50 };
    int element = 60;
    int position = 5;

    int[] newArr = new int[arr.length + 1];

    for (int i = 0; i < position; i++) {
      newArr[i] = arr[i];
    }
    newArr[position] = element;
    for (int i = position; i < arr.length; i++) {
      newArr[i + 1] = arr[i];
    }

    System.out.println("Array after insertion:");
    System.out.println(Arrays.toString(newArr));
  }
}
