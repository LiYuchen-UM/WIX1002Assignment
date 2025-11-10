import java.util.Scanner;

public class j04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an interger: ");
        int number = input.nextInt();
        while (number >= 10) {
            int sum = 0;
            int temp = number;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            number = sum;
        }
        System.out.println("Output: " + number);
    }
}
