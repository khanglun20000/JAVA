import java.util.Scanner;
import java.util.Arrays;

public class ProblemL {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        int[][] int_arr = new int[num][3];
        
        for (int i=0; i<num; i++){
            for (int j=0; j<3; j++){
                int_arr[i][j] = myObj.nextInt();
            }
        }

        for (int i=0; i<num; i++){
            for (int j=0; j<3; j+=3){
                if (int_arr[i][j] + int_arr[i][j+1] == int_arr[i][j+2] || int_arr[i][j] - int_arr[i][j+1] == int_arr[i][j+2] || int_arr[i][j] * int_arr[i][j+1] == int_arr[i][j+2] || int_arr[i][j+2] * int_arr[i][j+1] == int_arr[i][j] || int_arr[i][j+2] * int_arr[i][j] == int_arr[i][j+1] || int_arr[i][j+1] - int_arr[i][j] == int_arr[i][j+2]){
                    System.out.println("Possible");
                } else {
                    System.out.println("Impossible");
                }
            }
        }

        //System.out.println(Arrays.deepToString(int_arr).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        myObj.close();
    }
}
