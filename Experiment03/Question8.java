import java.util.Scanner;

public class Question8 {

    String monthName;

    public Question8(int month) {

        String[] months = {
                "January","February","March",
                "April","May","June",
                "July","August","September",
                "October","November","December"
        };

        if(month >= 1 && month <= 12)
            monthName = months[month - 1];
        else
            monthName = "Invalid Month";
    }

    void display() {
        System.out.println("Month: " + monthName);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month Number (1-12): ");
        int month = sc.nextInt();

        Question8 obj = new Question8(month);
        obj.display();
    }
}