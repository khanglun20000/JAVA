/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Take two stones
* Link: https://open.kattis.com/contests/ggi5da/problems/twostones
* @author Khang
* @version 1.0, 10/29/2022
* 
* Method : Simple if else
* Status : Accepted
* Runtime: 0.1
*/

package Kattis2;
import java.util.Scanner;

public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N % 2 == 1){
            System.out.println("Alice");
        }
        else{
            System.out.println("Bob");
        }
    }
}
