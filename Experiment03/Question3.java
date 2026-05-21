import java.util.Scanner;

public class Question3 {

    public static String getMonth(int month) {

        String[] months = {
                "January","February","March",
                "April","May","June",
                "July","August","September",
                "October","November","December"
        };

        if(month >= 1 && month <= 12)
            return months[month - 1];
        else
            return "Invalid Month";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month Number (1-12): ");
        int month = sc.nextInt();

        System.out.println("Month: " + getMonth(month));
    }
}