/* Write the output for the following statements when x=9 and y=10 */

package Week4.Tutorial3;

public class w04t03 {
    public static void main(String[] args) {
        int x = 9, y = 10;
        System.out.println("a.");
        if (x < 10) 
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$$$$$");
        /* The output should be
        #####
        $$$$$
        */
        if (x < 10) {
            if (y < 10)
                System.out.println("*****");
            else{
                System.out.println("#####");
                System.out.println("$$$$$");
            }
        }
        
    }
}
