package Week4.OnClass;

import java.util.Scanner;

public class t05 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Input int a: ");
        a = input.nextInt();
        System.out.print("Input int b: ");
        b = input.nextInt();
        System.out.print("Input int c: ");
        c = input.nextInt();

        System.out.println("All numbers are positive: " + ((a > 0) && (b > 0) && (c > 0)));
        System.out.println("At least one number is even: "+ (((a % 2) == 0) || ((b % 2) == 0) || ((c % 2) == 0)));
        System.out.println("a is the largest and b is not equal to c: " + ((a > b) && (a > c) && (b != c)));
        System.out.println("No negative number: " + ((a >= 0) && (b >= 0) && (c >= 0)));
    }
}
