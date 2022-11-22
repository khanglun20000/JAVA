/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Coldputer Science
* Link: https://open.kattis.com/contests/mjt68e/problems/cold
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Count and print
* Status : Accepted
* Runtime: 0.10
*/
import java.util.Scanner;

public class Coldputer_Science {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();

        int array[] = new int [n+1];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
