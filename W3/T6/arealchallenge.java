import java.util.Scanner;
public class arealchallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        double side = Math.sqrt(n);
        System.out.printf("%.12f", side*4);
        sc.close();
        return;
    }
}
