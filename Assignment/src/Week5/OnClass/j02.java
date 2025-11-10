import java.util.Scanner;

public class j02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your mark: ");
        double mark = input.nextInt();
        if (mark >= 90 && mark <= 100) {
            System.out.println("Grade A");
        } else if (mark >= 80 && mark < 90) {
            System.out.println("Grade B");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("Grade C");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("Grade D");
        } else if (mark >= 0 && mark < 60) {
            System.out.println("Grade F");
        }
    }
}
