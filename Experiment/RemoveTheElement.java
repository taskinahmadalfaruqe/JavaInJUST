import java.util.Arrays;

public class RemoveTheElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int elementToRemove = 30;

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToRemove) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            int[] newArr = new int[arr.length - 1];

            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != index) {
                    newArr[j++] = arr[i];
                }
            }

            System.out.println("Array after removing element:");
            System.out.println(Arrays.toString(newArr));
        }
    }
}