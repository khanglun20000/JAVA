import java.util.Scanner;
import java.util.Arrays;
import java.util.Objects;
import java.util.Arrays;

public class journey2 {
    public static int counter;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int parks = sc.nextInt();
        int array[][] = new int[parks+1][parks+1];
        for(int i = 0; i < parks; i++) {
            for(int j = 0; j < parks; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int result[][] = new int[parks+1][parks+1];
        for(int i = 0; i < parks; i++) {
            for(int j = 0; j < parks; j++) {
                if (i == j) {
                    result[i][j] = -1;
                }

                else if(array[i][j] == -1) {
                    result[i][j] = -1;
                }

                else result[i][j] = 999;
            }
        }
        
        printarray(array, parks, parks);
        printarray(result, parks, parks);
        find(array, result, parks);
    }

    public static void printarray(int array [][], int r, int c) {
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void find(int array[][], int result[][], int parks) {
        

    }

    public static int[] sumrow(int array[][], int row, int col) {
        int sumresult[] = new int[col];
        for (int j = 0; j < col; j++) {
            int sum = 0;
            for(int i = 0; i < row; i++) {
                sum += array[i][j];
            }
            sumresult[j] = sum;
        }

        return sumresult;
    }
}
