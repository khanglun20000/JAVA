/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Welcome to code jam
* Link: https://open.kattis.com/contests/tbnznz/problems/welcomeeasy
* @author Thanh
* @version 1.0, 11/20/2022
* 
* Method : Use recursion for each letter needed to be found then move on with the next letter to be found
* Status : Accepted
* Runtime: 0.15
*/
import java.util.Scanner;

public class jamcode {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String title = "welcome to code jam";
        int c = 0;
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String line = sc.nextLine();
            System.out.printf("Case #%d: %04d \n", ++c, checkLetter( 0, 0, title, line));

        }

        sc.close();
        
    }

    static int checkLetter(int indexInLine, int indexInTitle, String title, String line) {
        if (indexInTitle == title.length()) {
            return 1;
        }
        else if (indexInLine == line.length()) {
            return 0;
        }

        int total = checkLetter(indexInLine+1, indexInTitle, title, line);
        
        if (line.charAt(indexInLine) == title.charAt(indexInTitle)) {
            total = total + checkLetter(indexInLine+1, indexInTitle+1, title, line);
        }
        return total;
    }
}
