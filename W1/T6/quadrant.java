/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Quadrant Selection
* Link: https://open.kattis.com/contests/mjt68e/problems/quadrant
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : If statements
* Status : Accepted
* Runtime: 0.09
*/
import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x >= 0 & y>= 0) {
            System.out.println(1);
        }
        else if (x < 0 & y < 0) {
            System.out.println(3);
        }
        else if (x > 0 & y < 0) {
            System.out.println(4);
        }
        else if (x < 0 & y > 0) {
            System.out.println(2);
        }
    }
}
