/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Bounding Robot
* Link: https://open.kattis.com/contests/ggi5da/problems/boundingrobots
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Store variable and use if statements
* Status : Accepted
* Runtime: 0.25
*/
import java.util.Objects;
import java.util.Scanner;

public class robot { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while (true) {
        int width = sc.nextInt();
        int length = sc.nextInt();
        if (width ==0 &  length == 0) {
            return;
        }

        else {
            int posX = 0;
            int poxY = 0;
            int actualposX = 0;
            int actualposY = 0;
            int steps = sc.nextInt();
            for (int i = 0; i < steps; i++) {
                String move = sc.next();
                int distance = sc.nextInt();

                if(move.charAt(0) == 'u') {
                    poxY += distance;
                    actualposY += distance;
                    if (actualposY >= length - 1) actualposY = length - 1;
                    
                }
                else if(move.charAt(0) == 'd') {
                    poxY -= distance;
                    actualposY -= distance;
                    if (actualposY <= 0) actualposY = 0;

                }
                else if(move.charAt(0) == 'l') {
                    posX -= distance;
                    actualposX -= distance;
                    if (actualposX <= 0) actualposX = 0;

                }
                else if(move.charAt(0) == 'r') {
                    posX += distance;
                    actualposX += distance;
                    if (actualposX >= width - 1) actualposX = width - 1;

                }
            }
            System.out.println("Robot thinks " + posX + " " + poxY);
            System.out.println("Actually at " + actualposX + " " + actualposY);

        }
    }
}
}
