/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Flying Safely
* Link: https://open.kattis.com/contests/mjt68e/problems/flyingsafely
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use greedy algorithm DPS and count the total edges in the spanning tree
* Status : Accepted
* Runtime: 0.83
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;
public class flights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result[] = new int[n+1];
        for(int i = 0; i < n; i++) {
            int cities = sc.nextInt();
            int pilots = sc.nextInt();

            int flights[][] = new int[cities][cities];

            for (int k = 0; k < cities; k++) {
                for (int j = 0; j < cities; j++) {
                    flights[k][j] = 0;
                }
            }
    
            for(int j = 0; j < pilots; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                flights[a-1][b-1] = 1;
                flights[b-1][a-1] = 1;
            }
            result[i] = DepthFirstSearch(flights, cities, 2);
        }

        for(int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }

    }
    public static int DepthFirstSearch(int matrix[][], int nodes, int start) {
        int count = 0;
        int visited[] = new int[nodes + 1];
        Arrays.fill(visited, 0);
        Stack <Integer> stk = new Stack<>();
        stk.push(start);

        int oringin = stk.peek();

        while (!stk.empty()) {
            oringin = stk.peek();
            visited[oringin-1] = 1;
            stk.pop();
            for(int i = 0; i < nodes; i++) {
                if (matrix[oringin - 1][i] == 1) {
                    if(visited[i] == 0) {
                        if (!stk.contains(i+1)) {
                            stk.push(i + 1);
                        }
                    }

                } 
            }
            if (stk.empty()) break;
            count++;
        }
        return count;
    }
}
