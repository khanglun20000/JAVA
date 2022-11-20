/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Rational sequence 2
* Link: https://open.kattis.com/contests/uk27ry/problems/rationalsequence3
* @author Khang
* @version 1.0, 11/07/2022
* 
* Method : Reverse breadth fisrt search
* Status : Accepted
* Runtime: 0.26
*/


import java.util.Scanner;

public class RationalSequence3{
    public static int[] nthRational(int n, int[] frac)
    {
        if (n > 0){
            nthRational(n / 2, frac);
        }

        frac[(n+1)%2] += frac[n % 2];

        return frac;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();

        for(int i = 0; i < P; i++){
            int[] frac = { 0, 1 };
            int order = sc.nextInt();
            System.out.print(order + " ");
            int n = sc.nextInt();
            nthRational(n, frac);
            System.out.println(frac[0]+"/"+frac[1]);
        }

        sc.close();
    }
}