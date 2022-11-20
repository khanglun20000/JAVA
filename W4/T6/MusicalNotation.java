/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Musical Notation
* Link: https://open.kattis.com/contests/tbnznz/problems/musicalnotation
* @author Khang
* @version 1.0, 11/16/2022
* 
* Method : String
* Status : Accepted
* Runtime: 0.17
*/


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MusicalNotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noteCount = sc.nextInt();
        sc.nextLine();
        String notes = sc.nextLine();
        String[] notesArray = notes.split(" ");

        String[][] pattern = new String[14][noteCount];
        for(int i = 0; i < 14; i++){
            if(i == 11 || i%2 == 0){
                Arrays.fill(pattern[i], " ");
            }
            else{
                Arrays.fill(pattern[i], "-");
            }
        }

        List<Integer> indexOfMultiple = new LinkedList<Integer>();
        List<Integer> numOfMultiple = new LinkedList<Integer>();

        for(int i = 0; i < noteCount; i++){
            if(notesArray[i].length() < 2){
                int ith = notesArray[i].charAt(0) - 97 < 0 ?
                    -notesArray[i].charAt(0) + 71 :
                    -notesArray[i].charAt(0) + 110;

                pattern[ith][i] = "*";
            }
            else{
                int ith = notesArray[i].charAt(0) - 97 < 0 ?
                    -notesArray[i].charAt(0) + 71 :
                    -notesArray[i].charAt(0) + 110;

                pattern[ith][i] = String.join("", Collections.nCopies(notesArray[i].charAt(1) - '0', "*"));
                
                indexOfMultiple.add(i);
                numOfMultiple.add(notesArray[i].charAt(1) - '0');
            }
        }

        for(int i = 0; i < 14; i++){
            if(i <= 6){
                System.out.print((char)('G' - i) + ": ");
            }
            else{
                System.out.print((char)('g' - i + 7) + ": ");
            }
            
            int current = 0;

            for(int j = 0; j < noteCount; j++){
                if(i == 11 || i%2 == 0){
                    if(current < indexOfMultiple.size() && j == indexOfMultiple.get(current)){
                        if(pattern[i][j].equals(" ")){
                            System.out.print(String.join("", Collections.nCopies(numOfMultiple.get(current), " ")));
                        }
                        else{
                            System.out.print(pattern[i][j]);
                        }
                        current++;
                        if(j != noteCount - 1){
                            System.out.print(" ");
                        }
                    }
                    else if (j != noteCount - 1){
                        System.out.print(pattern[i][j] + " ");
                    }
                    else if (j == noteCount - 1){
                        System.out.print(pattern[i][j]);
                    }
                }
                else{
                    if(current < indexOfMultiple.size() && j == indexOfMultiple.get(current)){
                        if(pattern[i][j].equals("-")){
                            System.out.print(String.join("", Collections.nCopies(numOfMultiple.get(current), "-")));
                        }
                        else
                        {
                            System.out.print(pattern[i][j]);
                        }
                        if(j != noteCount - 1){
                            System.out.print("-");
                        }
                        current++;
                    }
                    else if (j != noteCount - 1){
                        System.out.print(pattern[i][j] + "-");
                    }
                    else if (j == noteCount - 1){
                        System.out.print(pattern[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }
}
