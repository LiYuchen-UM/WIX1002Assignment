package Week4.OnClass;

import java.util.Scanner;

public class j11onClasee {
    public static void main(String[] args) {
        System.out.println("Enter initial balance: ");
        Scanner input = new Scanner(System.in);
        int bal = input.nextInt();
        System.out.println("Enter the number");
        System.out.println("1. Desposit\n2.Withdraw\n3.Check Balance\n4. Exit");
        int option = input.nextInt();
        
        switch (option) {
            case 1:
                System.out.print("Enter amount to deposit: ");
                int deposit = input.nextInt();
                bal += deposit;
                break;
            case 2:
                System.out.println("Enter the amount to withdraw: ");
                int withdraw = input.nextInt();
                if (withdraw > bal) {
                    System.out.println("Failed! You don't have enou");
                }
            default:
                break;
        }
    }
}
