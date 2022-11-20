import java.util.Objects;
import java.util.Scanner;

public class estimate { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String estimate[] = new String[n];

        for(int i = 0; i < n; i++) {
            estimate[i] = sc.next();
        }

        for(int i = 0; i < n; i++) {
            
            int length = estimate[i].length();
            System.out.println(length);
        }
    }
}
