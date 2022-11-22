/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Mancala
* Link: https://open.kattis.com/contests/ggi5da/problems/mancala
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use recursion and the pattern to calculate the stones position
* Status : Accepted
* Runtime: 0.34
*/
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class mancala { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int testcase[] = new int[N];
        int totalCounter[] = new int[N];

        for(int i = 0; i < N; i++) {
            testcase[i] = sc.nextInt();
            totalCounter[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            ArrayList<Integer> result = calculate(totalCounter[i]);
            System.out.print(testcase[i] + " ");
            System.out.print(result.get(result.size()-1) + "\n");
            int counter = 0;
            for (int j = 0; j < result.size(); j++) {
                System.out.print(result.get(j));
                counter++;
                if (counter % 10 == 0) {
                    System.out.print("\n");
                }
                else {
                    if (j != result.size())
                    System.out.print(" ");
                }
            }
            if (i != N - 1)
            System.out.print("\n");
            
        }
    }

    public static ArrayList<Integer> calculate(int counter) {
        if (counter==1) {
            ArrayList<Integer> array1 = new ArrayList<Integer>();
            array1.add(1);
            return array1;
        }
        else {
            ArrayList<Integer> array = calculate(counter-1);
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) == 0) {
                    array.set(i, i+1);
                    for (int j = 0; j < i; j++) {
                        array.set(j, array.get(j) - 1);
                    }
                    break;
                }
                else if (array.get(i) != 0 && i == array.size()-1) {
                    array.add(i+2);
                    for (int j = 0; j < i+1; j++) {
                        array.set(j, array.get(j) - 1);
                    }
                    return array;
                }
            }
            return array;
        }
    }
}
