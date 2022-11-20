import java.util.Scanner;

public class faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int factor = 1 + (x * (y-1));
        System.out.println(factor);
    }
}
