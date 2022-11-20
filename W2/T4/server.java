/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Server
* Link: https://open.kattis.com/contests/ggi5da/problems/server
* @author Khang
* @version 1.0, 10/26/2022
* 
* Method : For loop
* Status : Accepted
* Runtime: 0.1
*/


package Kattis2;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taskNum = sc.nextInt();
        int totalMin = sc.nextInt();
        int[] taskTimes = new int[taskNum];

        for(int i = 0; i < taskNum; i++){
            taskTimes[i] = sc.nextInt();
        }

        sc.close();

        int tasksCanDone = 0;
        int minSum = 0;
        for(int i = 0; i < taskNum; i++){
            minSum += taskTimes[i];
            if(minSum > totalMin){
                break;
            }
            tasksCanDone++;
        }

        System.out.println(tasksCanDone);
    }
}
