package Week3.Lab2;

import java.util.Scanner;

public class w03l02 {
    public static void main(String[] args) {
        double P,D,R,Y,M;
        Scanner input = new Scanner(System.in);

        System.out.print("Input The price of the car: ");
        P = input.nextDouble();
        System.out.print("Input Down payment: ");
        D = input.nextDouble();
        System.out.print("Input Interest Rate in %: ");
        R = input.nextDouble();
        System.out.print("Input Loan duration in year: ");
        Y = input.nextDouble();

        M = (P - D) * (1.0 + R * Y / 100.0) / (Y * 12.0);
        System.out.println("Your Monthly Payment: " + M);
    }
}
