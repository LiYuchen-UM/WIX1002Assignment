/*Write statements for each of the following
a. Determine whether 3x8=27.
b. Determine whether an input integer is an odd number or even number. 
c. Determine whether a character is a capital letter. 
d. Display two strings in alphabetical order ignoring their case.
e. A switch statement that display Sunday, Monday, .., Satudary if the input is 0, 1, …, 6.
 */

package Week4.Tutorial3;

import java.util.Scanner;

public class w04t01 {
    public static void main(String[] args) {
        // a.
        System.out.println((3 * 8 == 27) ? "3x8=27 is true" : "3x8=27 is false");
        // b.
        Scanner input = new Scanner(System.in);
        System.out.print("Input an interger: ");
        System.out.println((input.nextInt() % 2 == 0) ? "Even number" : "Odd number");
        // c.
        System.out.print("Input a character: ");
        char c = input.next().charAt(0);
        System.out.println(Character.isUpperCase(c) ? "Captial letter!" : "Not a captial letter.");
        // d.
        input.nextLine();
        System.out.print("Enter String 1: ");
        String str1 = input.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = input.nextLine();
        System.out.println((str1.compareToIgnoreCase(str2) <= 0) ? str1 + " " + str2 : str2 + " " + str1);
        // e.
        System.out.print("Enter a day(0-6): ");
        switch (input.nextInt()) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invaild input!");
                break;
        }
    }
}
