import java.util.Scanner;

public class j01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println("Largest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is " + b);
        } else if (c > a && c > b) {
            System.out.println("Largest number is " + c);
        } else {
            System.out.println("Some numbers are equal.");
        }
    }
}
