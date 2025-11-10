/*Correct the error for the following statements.
a.
if (num1 = num2)
System.out.println("Number 1 is equal to number 2.");
b.
if (x > y > z)
 System.out.println("x is the largest number");
c.
String s1, s2;
if (s1==s2)
 System.out.println("They are equal strings.");
else (s1!=s2)
 System.out.println("They are not equal strings.");
d.
if x>0 or y>0;
 System.out.println("Either x or y is positive"); */

package Week4.Tutorial3;

public class w04t02 {
    public static void main(String[] args) {
        // a. delete the first ;
        if (num1 = num2) 
            System.out.println("Number 1 is equal to number 2.");
        // b.
        if (x > y && x > z)
            System.out.println("x is the largest number");
        // c.
        String s1, s2;
        if (s1.equals(s2))
            System.out.println("They are equal strings.");
        else
            System.out.println("They are not equal strings.");
        // d.
        if (x > 0 || y > 0)
            System.out.println("Either x or y is positive");
    }
}
