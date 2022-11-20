package Kattis2;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int[] a = new int[3];
        int[] b = new int[3];

        for(int i = 0; i < 3; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int min = a[0];
        int max = b[0];

        for(int i = 1; i < 3; i++){
            if(min > a[i]){
                min = a[i];
            }
            if(max < b[i]){
                max = b[i];
            }
        }

        int fee = 0;

        for(int i = min; i <= max; i++){
            int carNum = 0;
            for(int j = 0; j < 3; j++){
                if(i >= a[j] && i < b[j]){
                    carNum++;
                }
            }
            //System.out.println(i + " " + carNum);
            
            switch(carNum){
                case 1:
                    fee += A;
                    //System.out.println(i + " " + carNum + " " + A);
                    break;
                case 2:
                    fee += B * 2;
                    //System.out.println(i + " " + carNum + " " + B);
                    break;
                case 3:
                    fee += C * 3;
                    //System.out.println(i + " " + carNum + " " + C);
                    break;
            }
        }

        System.out.println(fee);
    }
}
