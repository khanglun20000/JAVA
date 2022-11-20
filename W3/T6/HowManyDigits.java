/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: How many digits?
* Link: https://open.kattis.com/contests/uk27ry/problems/howmanydigits
* @author Khang
* @version 1.0, 11/07/2022
* 
* Method : Simple math
* Status : Accepted
* Runtime: 0.39
*/

import java.util.Scanner;
import java.lang.Math;

public class HowManyDigits {
    public static void main(String[] args) {
        int[] array = new int[1000001];
        double d = 0;
        int current = 0;
        array[0] = 1;
        array[1] = 1;
        for(int i = 2; i <= 1000000; i++){
            d+= Math.log10(i);
            current = (int)Math.floor(d) + 1;
            array[i] = current;
        }

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            System.out.println(array[sc.nextInt()]);
        }

        sc.close();
    }
}
