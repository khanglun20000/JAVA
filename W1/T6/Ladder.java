/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Ladder
* Link: https://open.kattis.com/contests/mjt68e/problems/ladder
* @author Khang
* @version 6.0, 10/26/2022
* 
* Method : Use Math
* Status : Accepted
* Runtime: 0.09
*/


import java.util.Scanner;

public class Ladder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int v = sc.nextInt();

        double r = Math.toRadians(v);

        int l = (int)Math.ceil(h / Math.sin(r));

        System.out.println(l);
    }
}
