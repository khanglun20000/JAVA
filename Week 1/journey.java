import java.util.Scanner;
import java.util.Arrays;
import java.util.Objects;
import java.util.Arrays;

public class journey {
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
        for (int i = 0; i < parks; i++) {
            for (int j = 0; j <parks; j++) {
                int threearray[][] = new int[parks][2];
                Arrays.fill(threearray, 0);
                if (result[i][j] != -1) {
                    for (int k =0; k < parks; k++) {
                        if (result[i][k] != -1) {
                            int resultk[] = new int[2];
                            resultk = check(array, result, parks, i, j, resultk);
                            threearray[k][0] = resultk[0];
                            threearray[k][1] = resultk[1];
                        }
                    }
                    int pack[] = sumrow(threearray, 3, parks);
                    int total_count = pack[0];
                    int total_sum = pack[1];
                    result[i][j] = array[i][j]*total_count - total_sum;
                }

                printarray(result, parks, parks);
            }
        }
    }

    public static int[] check(int array[][], int result[][], int parks, int x, int y, int[] subarray) {
        if (result[x][y] == -1) {
            subarray[0] = 0;
            subarray[1] = 0;
            return subarray;
        }

        else if(result[x][y] == 999) {
            for (int i = 0; i < parks; i++) {
                if (y != i) {
                    subarray[0]++;
                    int subarray2[] = new int[2];
                    subarray2[0] = subarray[0];
                    subarray2[1] = subarray[1];
                    subarray = check(array, result, parks, y, i, subarray2);

                }
            }
            return subarray;
        }

        else {
            subarray[1] += array[x][y];
            return subarray;
        }
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
