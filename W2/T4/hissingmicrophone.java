import java.util.Arrays;
import java.util.Scanner;
public class ProblemF{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 
        String str = myObj.nextLine();
        String[] str_arr = str.split("");
        int b = 0;

        for(int i=1; i<str_arr.length; i++){
            
            if (str_arr[i].compareTo(str_arr[i-1]) == 0 && str_arr[i].compareTo("s") == 0){
                b = 1;
                break;
            } else{
                b = 0;
            }
        }
       
        if (b == 1){
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
        myObj.close();
    }
    
}