package Week3.Lab2;

public class w03l03 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*40 + 10);
        int num2 = (int)(Math.random()*40 + 10);
        int num3 = (int)(Math.random()*40 + 10);
        System.out.println("3 random numbers: " + num1 + ", " + num2 + ", " + num3);
        int sum = num1 + num2 + num3;
        System.out.println("Sum of 3 numbers: " + sum);
        double average = (num1 + num2 + num3) / 3.0;
        System.out.printf("The average: %.2f\n", average);
    }
}
