/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Jewerly Box
* Link: https://open.kattis.com/contests/ggi5da/problems/jewelrybox
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use derivative to calculate the maximum
* Status : Accepted
* Runtime: 0.74
*/
import java.util.Objects;
import java.util.Scanner;

public class jewerly { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int X[] = new int[n];
        int Y[] = new int[n];

        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        for (int i = 0 ; i < n; i++) {
            double delta = 16*(X[i]+Y[i])*(X[i]+Y[i]) - 48*X[i]*Y[i];
            double h1 = (4*(X[i]+Y[i]) + Math.sqrt(delta)) / 24;
            double h2 = (4*(X[i]+Y[i]) - Math.sqrt(delta)) / 24;
            double vol1 = h1 * (X[i] - 2*h1) * (Y[i] - 2*h1);
            double vol2 = h2 * (X[i] - 2*h2) * (Y[i] - 2*h2);

            double finalvol = Math.max(vol1, vol2);
            System.out.printf("%.11f", finalvol);
            if (i != n-1) {
                System.out.print("\n");
            }
        }
        

    }
}
