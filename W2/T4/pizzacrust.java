/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Bus
* Link: https://open.kattis.com/contests/ggi5da/problems/bus
* @author Viet
* @version 1.0, 11/02/2022
* 
* Method : Math
* Status : Accepted
* Runtime: 0.11
*/
import java.util.Scanner;
public class pizzacrust{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 
        int r = myObj.nextInt();
        int c = myObj.nextInt();

        double percent = ((r-c)*(r-c)*100/(double)(r*r))*1.000000;
        System.out.format("%1.6f", percent); 
        
        myObj.close();
    }
}
