/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Identifying map tiles
* Link: https://open.kattis.com/contests/mjt68e/problems/maptiles2
* @author Khang
* @version 5.0, 10/26/2022
* 
* Method : Math
* Status : Accepted
* Runtime: 0.15
*/

import java.util.Scanner;

public class Quadkey {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int level = 0;
        int x = 0;
        int y = 0;

        int digit;
        String[] digits = input.split("");

        for(int i = 0; i < digits.length; i++)
        {
            digit = Integer.parseInt(digits[i]);
            level++;

            if(level == 1){
                x = digit % 2;
                y =  (digit % 4 == 0 || digit % 4 == 1) ? 0 : 1;
            }
            else{
                if(digit % 2 == 1){
                    x = x*2 + 1;
                }
                else{
                    x *= 2;
                }

                if(digit % 4 == 0 || digit % 4 == 1){
                    y *= 2;
                }
                else{
                    y = y*2 + 1;
                }
            }
        }

        System.out.println(level + " " + x + " " + y);



    //     String map[][] = new String[(int)Math.pow(2,level)][(int)Math.pow(2,level)];
       
    //     for(String[] row : map){
    //         Arrays.fill(row, "");
    //     }

    //     for(int i = 1; i <= level; i++){
    //         for(int j = 0; j < Math.pow(2, level); j++){
    //             for(int k = 0; k < Math.pow(2, level); k++){
    //                      if(k % Math.pow(2,i) >= 0 && k % Math.pow(2,i) < Math.pow(2, i - 1) && j% Math.pow(2, i) >= 0 && j% Math.pow(2, i) < Math.pow(2, i - 1)){
    //                     map[k][j] = '0' + map[k][j];
    //                 }
    //                 else if(k % Math.pow(2,i) >= 0 && k % Math.pow(2,i) < Math.pow(2, i - 1) && j% Math.pow(2, i) >= Math.pow(2, i - 1) && j% Math.pow(2, i) < Math.pow(2, i)){
    //                     map[k][j] = '1' + map[k][j];
    //                 }
    //                 else if(k % Math.pow(2,i) >= Math.pow(2, i - 1) && k % Math.pow(2,i) < Math.pow(2, i) && j% Math.pow(2, i) >= 0 && j% Math.pow(2, i) < Math.pow(2, i - 1)){
    //                     map[k][j] = '2' + map[k][j];
    //                 }
    //                 else if(k % Math.pow(2,i) >= Math.pow(2, i - 1) && k % Math.pow(2,i) < Math.pow(2, i) && j% Math.pow(2, i) >= Math.pow(2, i - 1) && j% Math.pow(2, i) < Math.pow(2, i)){
    //                     map[k][j] = '3' + map[k][j];
    //                 }
    //             }
    //         }
    //     }

    //     search :{
    //         for(int i = 0; i < Math.pow(2, level);i++){
    //         for(int j = 0; j < Math.pow(2, level); j++){
    //             if(input.equals(map[j][i])){
    //                 System.out.println(level + " " + i + " " + j);
    //                 break search;
    //             }
    //         }
    //     }
    //     }
    // 
    }

}
