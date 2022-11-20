import java.util.Scanner;

public class Ladder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int v = sc.nextInt();

        double r = Math.toRadians(v);

        int l = (int)Math.ceil(h / Math.sin(r));

        System.out.println(l);
    }
}
