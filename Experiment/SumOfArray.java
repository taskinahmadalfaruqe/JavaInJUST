public class SumOfArray {
    public static void main(String[] args) {

        // Declare and initialize array
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;


        for (int num : numbers) {
            sum += num;
        }

        // Display result
        System.out.println("Sum of array elements: " + sum);
    }
}