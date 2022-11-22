/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Timeloop
* Link: https://open.kattis.com/problems/timeloop
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : for loop
* Status : Accepted
* Runtime: 0.13
*/

import java.util.Scanner;

public class timeloop {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (i == 100) {
                break;
            }
            System.out.println((i+1) + " Abracadabra");
        }
    }
}