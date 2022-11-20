import java.util.Objects;
import java.util.Scanner;

public class sok { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int orange = sc.nextInt();
        int apple = sc.nextInt();
        int pineapple = sc.nextInt();

        int ratio_orange = sc.nextInt();
        int ratio_apple = sc.nextInt();
        int ratio_pineapple = sc.nextInt();

        double total_orange = (double) orange / ratio_orange;
        double total_apple = (double) apple / ratio_apple;
        double total_pineapple = (double) pineapple / ratio_pineapple;

        double min1 = Math.min(total_apple, total_pineapple);
        double min2 = Math.min(total_apple, total_orange);
        double total_min = Math.min(min1, min2);

        double left_orange = orange - total_min*ratio_orange;
        double left_apple = apple - total_min*ratio_apple;
        double left_pineapple = pineapple - total_min*ratio_pineapple;

        System.out.printf("%.6f ", left_orange);
        System.out.printf("%.6f ", left_apple);
        System.out.printf("%.6f", left_pineapple);


    }
}
