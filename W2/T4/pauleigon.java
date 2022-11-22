/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Paul Eigon
* Link: https://open.kattis.com/contests/ggi5da/problems/pauleigon
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use if statement to check if the score is divisible by the turnover
* Status : Accepted
* Runtime: 0.10
*/
import java.util.Objects;
import java.util.Scanner;

public class pauleigon { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int paul = sc.nextInt();
        int opponent = sc.nextInt();

        int sum = paul + opponent;

        int turnover = sum / n;
        if (turnover%2 == 0) {
            System.out.println("paul");
        }
        else System.out.println("opponent");
    }
}
