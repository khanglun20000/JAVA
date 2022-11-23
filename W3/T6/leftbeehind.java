/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Left Beehind
* Link: https://open.kattis.com/contests/uk27ry/problems/leftbeehind
* @author Viet
* @version 1.0, 11/08/2022
* 
* Method : if...else for every case
* Status : Accepted
* Runtime: 0.10
*/
import java.util.Scanner;
public class leftbeehind {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        while (myObj.hasNext()==true){
            int sweet = myObj.nextInt();
            int sour = myObj.nextInt();
            
            if ((sweet == sour) && (sweet ==0)){
                break;
            }
            else if (sweet + sour == 13){
                System.out.println("Never speak again.");
            }
            else if (sweet > sour){
                System.out.println("To the convention.");
            } 
            else if (sweet < sour){
                System.out.println("Left beehind.");
            }
            else /*if ((sweet == sour) && (sweet !=0))*/{
                System.out.println("Undecided.");
            }
        }
        
        myObj.close();
    }
}
