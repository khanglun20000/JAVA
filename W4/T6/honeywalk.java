/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Honey Walk
* Link: https://open.kattis.com/contests/tbnznz/problems/honey
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use dynamic programming to store subproblems and solve the problem using DP principle, represent honey walk as an array
* Status : Accepted
* Runtime: 0.10
*/
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class honeywalk {
    public static void main(String[] args) {
    
        int array[][][] = new int[29][29][15];

        int originX = 14;
        int originY = 14;

        int maxWidth = 29;
        int maxHeight = 29;
        int maxStep = 15;

        for(int i = 0; i < maxHeight; i++) {
            for (int j = 0; j < maxWidth; j++) {
                if (i == originX & j == originY) {
                    array[i][j][0] = 1;
                }
                else array[i][j][0] = 0;
            }
        }
        
        for (int k = 1; k < maxStep; k++) {
            for(int i = 0; i < maxHeight; i++) {
                for (int j = 0; j < maxWidth; j++) {
                    int sum = 0;
                    if (i != 0) {
                        sum = sum + array[i-1][j][k-1];
                    }
                    if (i != 0 & j != 28 ) {
                        sum = sum + array[i-1][j+1][k-1];
                    }
                    if (i != 28) {
                        sum = sum + array[i+1][j][k-1];
                    }
                    if (j != 28) {
                        sum = sum + array[i][j+1][k-1];
                    }
                    if (j != 0) {
                        sum = sum + array[i][j-1][k-1];
                    }
                    if (i != 28 & j != 0) {
                        sum = sum + array[i+1][j-1][k-1];
                    }
                    array[i][j][k] = sum;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            System.out.println(array[originX][originY][input]);
        }
    }
}
