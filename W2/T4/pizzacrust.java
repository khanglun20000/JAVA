import java.util.Scanner;
public class pizzacrust{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); 
        int r = myObj.nextInt();
        int c = myObj.nextInt();

        double percent = ((r-c)*(r-c)*100/(double)(r*r))*1.000000;
        System.out.format("%1.6f", percent); 
        
        myObj.close();
    }
}
