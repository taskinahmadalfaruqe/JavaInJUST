import java.util.Scanner;

public class Question1 {

    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        System.out.println("Area = " + areaOfCircle(radius));
    }
}