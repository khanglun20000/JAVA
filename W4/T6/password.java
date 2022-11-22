/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Password Hacking
* Link: https://open.kattis.com/contests/tbnznz/problems/password
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use probability to calculate the mean
* Status : Accepted
* Runtime: 0.25
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Double> percent = new ArrayList<Double>();
        double mean = 0;
        for(int i = 0; i < n; i++) {
            String line = sc.next();
            double percentage = sc.nextDouble();
            percent.add(percentage);
        }

        for(int i = 0; i < n; i++) {
            int maxIndex = percent.indexOf(Collections.max(percent));
            mean = mean + percent.get(maxIndex) * (i+1);
            percent.remove(maxIndex);
        }
        System.out.println(mean);
        
        sc.close();
        return;
    }
}
