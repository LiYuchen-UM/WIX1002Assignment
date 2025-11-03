package Week4.OnClass;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class t01 {
    public static void main(String[] args) {
        String name;
        int age;
        double GPA;
        boolean stu;
        Scanner input = new Scanner(System.in);

        System.out.println("Input your name: ");
        name = input.nextLine();
        System.out.println("Input your age: ");
        age = input.nextInt();
        System.out.println("Input your GPA: ");
        GPA = input.nextDouble();
        System.out.println("Are you a student? (true / false)");
        stu = input.nextBoolean();

        System.out.println("\n--- Output ---");
        if (stu) {
            System.out.println("Hello student!");
        }
        System.out.println("Welcome to UM, " + name + "! You are " + age + " years old, your GPA is " + GPA);
    }
}
