package Week4.OnClass;

import java.util.Scanner;

public class j06assignment {
    public static void main(String[] args) {
        int salary, credit;
        boolean hasDefault, approve;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter you salary: ");
        salary = input.nextInt();
        System.out.print("Enter your credit score: ");
        credit = input.nextInt();
        System.out.print("Do you have a loan default? (true/false): ");
        hasDefault = input.nextBoolean();

        approve = ((((salary >= 3000) && (credit >= 350)) || (salary >= 7000)) && !hasDefault);
        System.out.println("Approved: " + approve);
    }
}
