/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Just a Minute
* Link: https://open.kattis.com/contests/mjt68e/problems/justaminute
* @author Thanh
* @version 1.0, 10/26/2022
* 
* Method : Using 2 simultaneous arrays
* Status : Accepted
* Runtime: 0.82
*/

import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();

        int average1 = 0;
        int average2 = 0;

        for(int i = 0; i < n; i++) {
            average1 = average1 + sc.nextInt();
            average2 = average2 + sc.nextInt();
        }

        double total =  ((float) average2/((float) average1 *60));

        if (total > 1) {
            System.out.printf("%.9f",total);
        }
        else {
            System.out.println("measurement error");
        }
    }
}
