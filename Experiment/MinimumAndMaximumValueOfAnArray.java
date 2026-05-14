public class MinimumAndMaximumValueOfAnArray {
    public static void main(String[] args) {

        int[] arr = {10, 5, 25, 40, 2, 18};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}