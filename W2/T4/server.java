import java.util.Scanner;
import java.util.Arrays;

public class ProblemQ {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int t = myObj.nextInt();
        int total = 0;
        int count = 0;

        int[] n_arr = new int[n];

        for (int i=0; i<n; i++){
            n_arr[i] = myObj.nextInt();
        }

        for (int i=0; i<n; i++){
            total += n_arr[i];
            if (total <= t){
                count++;
            }
        }

        System.out.println(count);
        myObj.close();
    }
}