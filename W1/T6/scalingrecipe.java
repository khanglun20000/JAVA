/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Scaling Recipe
* Link: https://open.kattis.com/contests/mjt68e/problems/scalingrecipe
* @author Viet
* @version 1.0, 10/26/2022
* 
* Method : Basic math
* Status : Accepted
* Runtime: 0.10
*/
import java.util.Scanner;
public class scalingrecipe{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 
        int n = myObj.nextInt();
        int x = myObj.nextInt();
        int y = myObj.nextInt(); 
        int arr_n[] = new int [n];

        for (int i=0; i<n; i++){
            arr_n[i] = myObj.nextInt();
        }

        for (int i=0; i<n; i++){
            System.out.println(arr_n[i]*y/x);
        }
        myObj.close();
    }
}
