import java.util.Scanner;
public class bus {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        int [] num_arr = new int[num];


        for (int i=0; i<num; i++){
            num_arr[i] = myObj.nextInt();
        }

        for (int i=0; i<num; i++){
            double n  = 0;
            for (int j=0; j<num_arr[i]; j++){
                n = (n+0.5)*2;
            }
            System.out.printf("%1.0f\n", n);
        }
        
        myObj.close();
    }
}