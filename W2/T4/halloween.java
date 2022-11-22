/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: IsItHalloween?
* Link: https://open.kattis.com/contests/ggi5da/problems/isithalloween
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : use string compare to check each letter
* Status : Accepted
* Runtime: 0.10
*/
import java.util.Objects;
import java.util.Scanner;

public class halloween { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month = sc.next();
        int date = sc.nextInt();

        if (Objects.equals(month, "OCT")) {
            if (date == 31) {
                System.out.println("yup");
            }
            else System.out.println("nope");
        }
        else if (Objects.equals(month, "DEC")) {
            if (date == 25) {
                System.out.println("yup");
            }
            else System.out.println("nope");
        }
        else System.out.println("nope");
    }
}
