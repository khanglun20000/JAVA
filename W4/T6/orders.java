/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Bacon, Eggs, and Spam
* Link: https://open.kattis.com/contests/tbnznz/problems/baconeggsandspam
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use arraylist to scan and store names and foods then use Collections.sort() to print it out aphabetically
* Status : Accepted
* Runtime: 0.27
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> food = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<String>();
        while(true) {
            int array[][] = new int[20][10];
            int indexFood = 0;
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                String orders[] = line.split(" ");
                names.add(orders[0]);
                for (int j = 1; j < orders.length; j++) {
                    if(!food.contains(orders[j])) {
                        food.add(orders[j]);
                        array[i][indexFood] = 1;
                        indexFood++;
                    }
                    else {
                        array[i][food.indexOf(orders[j])] = 1;
                    }
                }
            }
            ArrayList <String> orderFood = new ArrayList<String>();
            for (int i = 0; i < food.size(); i++) {
                orderFood.add(food.get(i));
            }

            Collections.sort(orderFood);

            for (int k = 0; k < food.size(); k++) {


                String wordFood = orderFood.get(0);
                int index = food.indexOf(wordFood);
                orderFood.remove(0);
                
                ArrayList <String> orderName = new ArrayList<String>();
                for (int l = 0; l < names.size(); l++) {
                    if (array[l][index] == 1) {

                        orderName.add(names.get(l));
                    }
                }
                Collections.sort(orderName);

                System.out.print(wordFood + " ");
                for (int l = 0; l < orderName.size(); l++) {
                    System.out.print(orderName.get(l) + " ");
                }

                System.out.println();
            }
            food.clear();
            names.clear();
            System.out.println();
        }
        
    }
}
