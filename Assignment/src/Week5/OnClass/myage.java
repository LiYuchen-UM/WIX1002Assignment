import java.util.Scanner;

public class myage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age > 18) {
            System.out.println("Allow");
        } else {
            System.out.println("Not Allow");
        }
    }
}
