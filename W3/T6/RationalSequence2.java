/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Rational sequence 2
* Link: https://open.kattis.com/contests/uk27ry/problems/rationalsequence2
* @author Khang
* @version 1.0, 11/07/2022
* 
* Method : Breadth fisrt search
* Status : Accepted
* Runtime: 0.27
*/

import java.util.Scanner;

public class RationalSequence2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();

        for(int i = 0; i < P; i++){
            int order = sc.nextInt();
            System.out.print(order + " ");
            String[] inputs = sc.next().split("/");

   
            int p = Integer.parseInt(inputs[0]);
            int q = Integer.parseInt(inputs[1]);
            System.out.println(Rational(p, q));
        }

        sc.close();
    }

    public static int Rational(int p, int q){
        if(p > q){
            return 2 * Rational(p - q, q) + 1;
        }
        else if(p < q){
            return 2 * Rational (p, q - p);
        }
        else
            return 1;
    }
}