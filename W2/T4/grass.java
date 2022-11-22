/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Grass Seed Inc.
* Link: https://open.kattis.com/contests/ggi5da/problems/grassseed
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use array to store width and heights and then calculate using math
* Status : Accepted
* Runtime: 0.16
*/
import java.util.Objects;
import java.util.Scanner;

public class grass { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cost = sc.nextDouble();
        int lawn = sc.nextInt();
        double width[] = new double[lawn];
        double length[] = new double[lawn];

        for (int i = 0; i < lawn; i++) {
            width[i] = sc.nextDouble();
            length[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < lawn; i++) {
            double area = width[i] * length[i];
            sum += area*cost;
        }

        System.out.printf("%.7f",sum);
        
    }
}
