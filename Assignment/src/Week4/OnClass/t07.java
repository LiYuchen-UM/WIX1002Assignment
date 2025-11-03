package Week4.OnClass;

import java.util.Scanner;

public class t07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");
        }

        if (num > 0) {
            System.out.println("The number is positve.");
        } else if (num == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is negative.");
        }
    }
}
