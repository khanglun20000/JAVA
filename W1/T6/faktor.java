/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Faktor
* Link: https://open.kattis.com/contests/mjt68e/problems/faktor
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use math
* Status : Accepted
* Runtime: 0.09
*/
import java.util.Scanner;

public class faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int factor = 1 + (x * (y-1));
        System.out.println(factor);
    }
}
