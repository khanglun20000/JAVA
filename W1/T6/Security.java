/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: False Sense of Security
* Link: https://open.kattis.com/contests/mjt68e/problems/falsesecurity
* @author Khang
* @version 1.0, 10/26/2022
* 
* Method : Using 2 simultaneous arrays
* Status : Accepted
* Runtime: 0.82
*/

import java.util.Scanner;

public class Security {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.next());
        while(sc.hasNext()){
            sb.append("\n" + sc.next());
        }
        sc.close();

        String input = sb.toString();
        String[] inputArray = input.split("\n");
        for (String string : inputArray) {
            LineDecode(string);
        }
    }

    public static void LineDecode(String input){
        String[] letterArray = input.split("");
        int length = letterArray.length;
        String[] codeArray = new String[length];
        String[] numberArray = new String[length];
        String[] codes = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.","...", "-", "..-",
            "...-", ".--", "-..-", "-.--","--..", "..--", ".-.-", "---.", "----"
        };
        String[] letters = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
            "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "_", ",", ".", "?" 
        };

        for(int i = 0; i < input.length(); i++){
            for(int j = 0; j < letters.length; j++){
                if(letterArray[i].compareTo(letters[j])== 0){
                    codeArray[i] = codes[j];
                    numberArray[i] = Integer.toString(codeArray[i].length());
                }
            }
        }

        // for(int i = 0; i < codeArray.length; i++){
        //     System.out.print(codeArray[i] + " ");
        // }

        // System.out.println("");
        // for(int i = 0; i < length; i++){
        //     System.out.print(numberArray[i] + " ");
        // }

        String[] rev_numberArray = new String[length];
        for(int i = length - 1; i >= 0; i--){
            rev_numberArray[length - 1 - i] = numberArray[i];
        }

        // System.out.println("");
        // for(int i = 0; i < length; i++){
        //     System.out.print(rev_numberArray[i] + " ");
        // }

        String code = "";
        for(int i = 0; i < length; i++){
            code += codeArray[i]; 
        }

        String[] lineCode = new String[length];
        int counter = 0;
        for(int i = 0; i < length; i++){
            String temp = "";
            int step = Integer.parseInt(rev_numberArray[i]);
            temp = code.substring(counter, counter + step);
            counter += step;

            lineCode[i] = temp;
        }

        // System.out.println("");
        // for(int i = 0; i < length; i++){
        //     System.out.print(lineCode[i] + "    ");
        // }

        String lineMess = "";

        for(int i = 0; i < length; i++){
            for(int j = 0; j < letters.length; j++){
                if(lineCode[i].equals(codes[j])){
                    lineMess += letters[j]; 
                }
            }
        }
        System.out.println(lineMess);
    }
}
