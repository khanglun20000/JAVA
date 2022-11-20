/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Bijele
* Link: https://open.kattis.com/contests/mjt68e/problems/cudoviste
* @author Khang
* @version 1.0, 10/26/2022
* 
* Method : Brute force
* Status : Accepted
* Runtime: 0.16
*/

import java.util.Scanner;

public class Cudoviste{
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int S = sc.nextInt();
        String[] lineArray = new String[R];
        
        for (int i =0;i<R;i++){
            lineArray[i]=sc.next();
        }
        
        sc.close();

        String nodes = "";

        for (int i = 0; i < R; i++) {
            for(int j = 0; j < S; j++){
                nodes += lineArray[i].charAt(j);
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.println(CarsCrashed(i, R, S, nodes));
        }

    }

    public static int CarsCrashed(int i, int R, int S, String nodes){
        int carNum = 0;

        for(int y = 0; y < R - 1; y++){
            for(int x = 0; x < S - 1; x++){
                if(nodes.charAt(y * S + x) == '#'){
                    continue;
                }
                else {
                    int XCount = 0;
                    checkArea : 
                        for(int a = 0; a <= 1; a++){
                            for(int b = 0; b <= 1; b++){
                                if(nodes.charAt((y + a) * S + (x + b)) == '#'){
                                    XCount = -1;
                                    break checkArea;
                                }

                                if(nodes.charAt((y + a) * S + (x + b)) == 'X'){
                                    XCount++;
                                }
                            }
                        }

                    if(XCount == i)
                        carNum++;
                }
            }
        }
        return carNum;
    }
}
