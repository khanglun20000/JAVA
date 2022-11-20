import java.util.Objects;
import java.util.Scanner;

public class pauleigon { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int paul = sc.nextInt();
        int opponent = sc.nextInt();

        int sum = paul + opponent;

        int turnover = sum / n;
        if (turnover%2 == 0) {
            System.out.println("paul");
        }
        else System.out.println("opponent");
    }
}
