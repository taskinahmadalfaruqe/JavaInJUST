// Print the gretest  number 
import java.util.Scanner;
public class Question06{
    public static void main(){
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter The First Number: ");
    int a = sc.nextInt();
    System.out.print("Enter The Second Number: ");
    int b = sc.nextInt();
    System.out.print("Enter The Thierd Number: ");
    int c = sc.nextInt();
    if(a>b&&a>c){
        System.out.print("A Is Gretest.");
    } else if(b>a&&b>c){
        System.out.print("B Is Gretest.");
    }else{
        System.out.print("C Is Gretest.");
    };
    }
}