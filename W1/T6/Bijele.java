/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Bijele
* Link: https://open.kattis.com/contests/mjt68e/problems/bijele
* @author Khang
* @version 1.0, 10/26/2022
* 
* Method : Simple math
* Status : Accepted
* Runtime: 0.17
*/

import java.util.Scanner;

public class Bijele{
    static int Filter(int type, int having){
        return type - having;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int b = sc.nextInt();
        int kn = sc.nextInt();
        int p = sc.nextInt();

        System.out.println(Filter(1, k) + " " + Filter(1, q) + " " + Filter(2, r) + " " + Filter(2, b) + " " + Filter(2, kn) + " " + Filter(8, p));
    }
}