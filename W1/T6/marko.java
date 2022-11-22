/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Marko
* Link: https://open.kattis.com/contests/mjt68e/problems/marko
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Nested loops with predefined string pad and check for every word in the coresponding number pad
* Status : Accepted
* Runtime: 0.28
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Objects;

public class marko {
    public static void main(String[] args) {

        String pad[] = {"abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        int counter = 0;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String dic[] = new String[n+1];

        for(int i = 0; i < n; i++) {
            dic[i] = sc.next();
        }



        String message = sc.next();

        for (int j = 0; j < n; j++) {
            int wordcounter = 0;

            outerloop:
            for(int i = 0; i < message.length(); i++) {
                int number = Character.getNumericValue(message.charAt(i));
                innerloop:
                for (int k = 0; k < pad[number-2].length(); k++) {
                    if (Objects.equals(pad[number-2].charAt(k), dic[j].charAt(wordcounter))) {
                        wordcounter++;
                        break innerloop;
                    }
                    if (k == pad[number-2].length()-1) {
                        break outerloop;
                    }
                }
                if (i == message.length() - 1) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }

}