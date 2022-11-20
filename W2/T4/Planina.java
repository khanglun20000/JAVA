/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Planina
* Link: https://open.kattis.com/contests/ggi5da/problems/planina
* @author Khang
* @version 1.0, 10/26/2022
* 
* Method : Simple math
* Status : Accepted
* Runtime: 0.1
*/


package Kattis2;
import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;

        int cur = 4;

        if(n > 1){
            for(int i = 1; i < n; i++){
                cur = (int)Math.pow(Math.sqrt(cur) + Math.pow(2, i - 1), 2);
            }
        }

        System.out.println(cur);
    }
}
