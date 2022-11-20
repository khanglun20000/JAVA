
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Completing the square
* Link: https://open.kattis.com/contests/ggi5da/problems/completingthesquare
* @author Khang
* @version 1.0, 10/26/2022
* 
* Method : Simple math
* Status : Accepted
* Runtime: 0.13
*/


package Kattis2;
import java.util.Scanner;

public class CompletingTheSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];

        for(int i = 0; i < 3; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        sc.close();


        double maxDistance = 0;
        int middlePoint = -1;
        for(int i = 0; i < 3; i++){
            double d = Math.sqrt(Math.pow(x[i] - x[(i+1)%3], 2) + Math.pow(y[i] - y[(i+1)%3], 2));
            if(maxDistance < d){
                maxDistance = d;
                middlePoint = (i+2)%3;
            }
        }

        int x1 = (x[(middlePoint+1)%3] + x[(middlePoint+2)%3]) - x[middlePoint];
        int y1 = (y[(middlePoint+1)%3] + y[(middlePoint+2)%3]) - y[middlePoint];
        System.out.println(x1 + " " + y1);
     }
}
