package Week4.OnClass;

import java.util.Scanner;

public class j08 {
    public static void main(String[] args) {
        int mark;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        mark = input.nextInt();
        if (mark >= 90) {
            System.out.println("Grade A");
        } else if (mark >= 80) {
            System.out.println("Grade B");
        } else if (mark >= 70) {
            System.out.println("Grade C");
        } else if (mark >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("You failed!");
        }
    }
}
