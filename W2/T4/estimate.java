/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Quick Estimates
* Link: https://open.kattis.com/contests/ggi5da/problems/quickestimate
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use string instead of int then calculate to length of the number string
* Status : Accepted
* Runtime: 0.11
*/
import java.util.Objects;
import java.util.Scanner;

public class estimate { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String estimate[] = new String[n];

        for(int i = 0; i < n; i++) {
            estimate[i] = sc.next();
        }

        for(int i = 0; i < n; i++) {
            
            int length = estimate[i].length();
            System.out.println(length);
        }
    }
}
