import java.util.Scanner;

public class Question9 {

    double radius;
    double area;

    {
        area = Math.PI * radius * radius;
    }

    public Question9(double radius) {
        this.radius = radius;
        area = Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        Question9 obj = new Question9(radius);

        System.out.println("Area = " + obj.area);
    }
}