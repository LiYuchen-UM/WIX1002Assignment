import java.util.Scanner;

public class j03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your basic salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter your years of experience: ");
        double exp = input.nextDouble();
        System.out.println("Choose your job position by enter the number:");
        System.out.println("1. Manager");
        System.out.println("2. Engineer");
        System.out.print("3. Clerk\n> ");
        int job = input.nextInt();

        double taxAllowance = 0;
        double bonus = 0;
        double tax = 0;
        double totalBeforeTax;
        double netSalary;

        if (job == 1) {
            taxAllowance = 500;
        }

        if (exp >= 10) {
            bonus = 0.1 * salary;
        } else if (exp >= 5) {
            bonus = 0.05 * salary;
        } else {
            bonus = 0.02 * salary;
        }

        if ((salary + bonus - taxAllowance) >= 8000) {
            tax = (salary + bonus) * 0.1;
        } else if ((salary + bonus - taxAllowance) >= 5000) {
            tax = (salary + bonus) * 0.05;
        }

        totalBeforeTax = salary + bonus;
        netSalary = salary + bonus - tax;
        System.out.println("Total before tax: " + totalBeforeTax);
        System.out.println("Tax: " + tax);
        System.out.println("Net salary: "+ netSalary);
    }
}
