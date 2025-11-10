import java.util.Scanner;

public class j05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operation;
        do {
            System.out.println("\nChoose an operation");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. Exit");
            System.out.print("> ");
            operation = input.nextInt();
            System.out.print("Enter number A: ");
            int a = input.nextInt();
            System.out.print("Enter number B: ");
            int b = input.nextInt();
            int output;
            switch (operation) {
                case 1:
                    output = a + b;
                    System.out.println("Result: " + output);
                    break;
                case 2:
                    output = a - b;
                    System.out.println("Result: " + output);
                    break;
                case 3:
                    output = a * b;
                    System.out.println("Result: "+ output);
                    break;
                case 4:
                    if (b != 0) {
                        output = a / b;
                        System.out.println("Result: " + output);
                    } else System.out.println("Invail number b.");
                    break;
                case 5:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invaild Input!");
                    break;
            }

        } while (operation != 5);
        
    }
}
