/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Eligibility
* Link: https://open.kattis.com/contests/mjt68e/problems/eligibility
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use array strings and nested if conditions
* Status : Accepted
* Runtime: 0.26
*/
import java.util.Scanner;

public class eligibility{
    public static void main(String[] args){
        String[] arr_in = new String[50];
        String[] name = new String[20];
        String[] begin_day = new String[20];
        String[] birth_day = new String[20];
        String[] courses = new String[20];
        int num=0;
        
        Scanner myObj = new Scanner(System.in); 
        num = myObj.nextInt();
        
        for (int i=0; i<num; i++){
            arr_in[i] = myObj.nextLine();
        }

        int size = arr_in.length;

        for (int i=0; i<=size*3; i+=3){
            name[i] = arr_in[i];
            begin_day[i] = arr_in[i+1];
            birth_day[i] = arr_in[i+2];
            courses[i] = arr_in[i+3]; 
        }

        for (int i=0; i<num; i++){
            System.out.println(name[i]);
            if(Integer.parseInt(begin_day[i].substring(0, 4))>= 2010){
                System.out.print(" eligible");
                continue;
            } else if(Integer.parseInt(birth_day[i].substring(0, 4))>= 1991){
                System.out.print(" eligible");
                continue;
            } else if(Integer.parseInt(courses[i]) >40){
                System.out.print(" ineligible");
                continue;
            } else {
                System.out.print(" coach petitions");
            }
            
        }

        myObj.close();
    }

}