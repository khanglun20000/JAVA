/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: A Real Challenge
* Link: https://open.kattis.com/contests/uk27ry/problems/areal
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use a long int data then simple math to find the side then calculate the perimeter
* Status : Accepted
* Runtime: 0.10
*/
import java.util.Scanner;
public class arealchallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        double side = Math.sqrt(n);
        System.out.printf("%.12f", side*4);
        sc.close();
        return;
    }
}
