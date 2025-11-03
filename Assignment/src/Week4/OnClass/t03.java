package Week4.OnClass;

public class t03 {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + !a);
        System.out.println("!b = " + !b);

        int x = 10, y = 20;
        boolean result = (x < y) && (y > 5);
        System.out.println("(x < y) && (y > 5) = " + result);
        result = (x > y) || (y == 20);
        System.out.println("(x > y) || (y == 20) = " + result);
        result = !(x == 10);
        System.out.println("!(x == 10) = " + result);
    } 
}
