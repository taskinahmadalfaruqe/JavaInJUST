import java.util.Scanner;

public class Question6 {

    double radius;

    public Question6(double radius) {
        this.radius = radius;
    }

    void display() {
        double area = Math.PI * this.radius * this.radius;
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        Question6 obj = new Question6(r);
        obj.display();
        
        sc.close();
    }
}