import java.util.Scanner;
public class ProblemQ{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 
        int n = myObj.nextInt();
        int x = myObj.nextInt();
        int y = myObj.nextInt(); 
        int arr_n[] = new int [n];

        for (int i=0; i<n; i++){
            arr_n[i] = myObj.nextInt();
        }

        for (int i=0; i<n; i++){
            System.out.println(arr_n[i]*y/x);
        }
    }
}