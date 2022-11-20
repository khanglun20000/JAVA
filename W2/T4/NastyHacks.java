package Kattis2;
import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] cases = new int[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                cases[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            if(cases[i][0] + cases[i][2] < cases[i][1]){
                System.out.println("advertise");
            }
            else if(cases[i][0] + cases[i][2] == cases[i][1]){
                System.out.println("does not matter");
            }
            else{
                System.out.println("do not advertise");
            }
        }

    }
}
