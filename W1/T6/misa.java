/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Misa
* Link: https://open.kattis.com/contests/mjt68e/problems/misa
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Represent seats as array of integer and iterate through every seat for Misa to get the maximum handshakes
* Status : Accepted
* Runtime: 0.33
*/
import java.util.Scanner;
import java.util.Arrays;

public class misa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int S = sc.nextInt();

        int Seats[][] = new int[R+1][S+1];

        for (int i = 0; i < R; i++) {
            String array = sc.next();
            for (int j = 0; j < S; j++) {
                if (array.charAt(j) == '.') {
                    Seats[i][j] = 0;
                }
                else if (array.charAt(j) == 'o') {
                    Seats[i][j] = 1;
                }
            }            
        }

        int handshakes = possibleseats(Seats, R, S);
        System.out.println(handshakes);


    }

    public static int count(int seats[][], int R, int S) {
        int totalcount = 0;
        for(int i = 0; i <R; i++) {
                for(int j = 0; j < S; j++) {
                    if (seats[i][j] == 1) {
                        int count = 0;
                        if (i == 0 & j == 0) {
                            if (seats[i+1][j] == 1) count++;
                            if (seats[i][j+1] == 1) count++;
                            if (seats[i+1][j+1] == 1) count++;
                        }
                        else if ((i == 0) & (j == S-1)) {
                            if (seats[i][j-1] == 1) count++;
                            if (seats[i+1][j] == 1) count++;
                            if (seats[i+1][j-1] == 1) count++;
                        }

                        else if ((i == 0) & (j < S-1)) {
                            if (seats[i][j-1] == 1) count++;
                            if (seats[i][j+1] == 1) count++;
                            if (seats[i+1][j] == 1) count++;
                            if (seats[i+1][j-1] == 1) count++;
                            if (seats[i+1][j+1] == 1) count++;
                        }
                        //////
                        else if (i == R-1 & j == 0) {
                            if (seats[i-1][j] == 1) count++;
                            if (seats[i][j+1] == 1) count++;
                            if (seats[i-1][j+1] == 1) count++;
                        }
                        else if ((i == R-1) & (j == S-1)) {
                            if (seats[i][j-1] == 1) count++;
                            if (seats[i-1][j] == 1) count++;
                            if (seats[i-1][j-1] == 1) count++;
                        }

                        else if ((i == R-1) & (j < S-1)) {
                            if (seats[i][j-1] == 1) count++;
                            if (seats[i][j+1] == 1) count++;
                            if (seats[i-1][j] == 1) count++;
                            if (seats[i-1][j-1] == 1) count++;
                            if (seats[i-1][j+1] == 1) count++;
                        }

                        else if ((i < R-1) & (j == 0)) {
                            if (seats[i+1][j] == 1) count++;
                            if (seats[i-1][j] == 1) count++;
                            if (seats[i][j+1] == 1) count++;
                            if (seats[i+1][j+1] == 1) count++;
                            if (seats[i-1][j+1] == 1) count++;
                        }

                        else if ((i < R-1) & (j == S-1)) {
                            if (seats[i+1][j] == 1) count++;
                            if (seats[i-1][j] == 1) count++;
                            if (seats[i][j-1] == 1) count++;
                            if (seats[i+1][j-1] == 1) count++;
                            if (seats[i-1][j-1] == 1) count++;
                        }

                        else if ((i < R-1) & (j < S-1)) {
                            if (seats[i+1][j] == 1) count++;
                            if (seats[i-1][j] == 1) count++;
                            if (seats[i][j-1] == 1) count++;
                            if (seats[i][j+1] == 1) count++;
                            if (seats[i-1][j-1] == 1) count++;
                            if (seats[i+1][j+1] == 1) count++;
                            if (seats[i-1][j+1] == 1) count++;
                            if (seats[i+1][j-1] == 1) count++;
                        }
                        seats[i][j] = 0;
                        totalcount += count;
                        count = 0;
                    }
        }
    }
        return totalcount;
    }

    public static int possibleseats(int seats[][], int R, int S) {

        int copiedseats[][] = new int[R+1][S+1];
                for(int k=0; k<R; k++)
                    for(int z=0; z<S; z++)
                        copiedseats[k][z]= seats[k][z];
        int maximum = count(copiedseats, R, S);
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < S;j++) {

                for(int k=0; k<R; k++)
                    for(int z=0; z<S; z++)
                        copiedseats[k][z]= seats[k][z];

                if (copiedseats[i][j] == 0) {
                    copiedseats[i][j] = 1;
                    int result = count(copiedseats, R, S);
                    if (result >= maximum) {
                        maximum = result;
                        result = 0;
                    }
                }
                }
            }
    
        return maximum;

    }
}
