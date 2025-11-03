package Week4.OnClass;

import java.util.Scanner;

public class t04 {
    public static void main(String[] args) {
        boolean i, j;
        Scanner input = new Scanner(System.in);
        System.out.print("Input first boolean: ");
        i = input.nextBoolean();
        System.out.print("Input second boolean: ");
        j = input.nextBoolean();
        System.out.println("AND && = " + (i && j));
        System.out.println("OR || = " + (i || j));
        System.out.println("NOTj !i = " + !i);
        System.out.println("NOTi !j = " + !j);

        int x, y;
        System.out.print("Input first int: ");
        x = input.nextInt();
        System.out.print("Input second int: ");
        y = input.nextInt();
        System.out.println("(x > 0) && (y > 0) = " + ((x > 0) && (y > 0)));
        System.out.println("(x > y) || (y == 10) = " + ((x > y) || (y == 10)));
        System.out.println("!(x == y) = " + !(x == y));
    }
}
