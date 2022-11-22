/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Sibice
* Link: https://open.kattis.com/contests/ggi5da/problems/sibice
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use array and math
* Status : Accepted
* Runtime: 0.10
*/
import java.util.Objects;
import java.util.Scanner;

public class sibice { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        double maximum_length = Math.sqrt(h*h + w*w);
        int matches[] = new int[n];
        for (int i = 0; i < n; i++) {
            int amaches = sc.nextInt();
            matches[i] = amaches;
        }

        for (int i = 0; i < n; i++) {
            if (matches[i] <= maximum_length) {
                System.out.println("DA");
            }
            else System.out.println("NE");
        }
    }
}
