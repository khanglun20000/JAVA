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
public class bus {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        int [] num_arr = new int[num];


        for (int i=0; i<num; i++){
            num_arr[i] = myObj.nextInt();
        }

        for (int i=0; i<num; i++){
            double n  = 0;
            for (int j=0; j<num_arr[i]; j++){
                n = (n+0.5)*2;
            }
            System.out.printf("%1.0f\n", n);
        }
        
        myObj.close();
    }
}
