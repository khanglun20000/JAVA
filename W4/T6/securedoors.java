/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Secure Doors
* Link: https://open.kattis.com/contests/tbnznz/problems/securedoors
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use array list of boolean and strings for status and names of each person, then check using the boolean list 
* Status : Accepted
* Runtime: 0.22
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class securedoors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Boolean> status = new ArrayList<Boolean>();
        ArrayList<String> names = new ArrayList<String>();

        sc.nextLine();
        for(int i = 0; i<n; i++) {
            String line = sc.nextLine();
            String[] entries = line.split(" ");
            if (!names.contains(entries[1])) {
                names.add(entries[1]);
                if(entries[0].equals("entry")) {
                    System.out.println(entries[1] + " entered");
                    status.add(true);
                }
                else {
                    System.out.println(entries[1] + " exited (ANOMALY)");
                    status.add(false);
                }
            }
            else {
                int index = names.indexOf(entries[1]);
                if (entries[0].equals("entry")) {
                    if (status.get(index)) {
                        System.out.println(entries[1] + " entered (ANOMALY)");
                        status.set(index, true);
                    }
                    else {
                        System.out.println(entries[1] + " entered");
                        status.set(index, true);
                    }
                }
                else if (entries[0].equals("exit")) {
                    if (status.get(index)) {
                        System.out.println(entries[1] + " exited");
                        status.set(index, false);
                    }
                    else {
                        System.out.println(entries[1] + " exited (ANOMALY)");
                        status.set(index, false);
                    }
                }
            }
        }
        
    }
}
