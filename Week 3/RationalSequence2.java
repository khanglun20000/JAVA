import java.util.Scanner;

public class RationalSequence2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();

        for(int i = 0; i < P; i++){
            int order = sc.nextInt();
            System.out.print(order + " ");
            String[] inputs = sc.next().split("/");

   
            int p = Integer.parseInt(inputs[0]);
            int q = Integer.parseInt(inputs[1]);
            System.out.println(Rational(p, q));
        }

        sc.close();
    }

    public static int Rational(int p, int q){
        if(p > q){
            return 2 * Rational(p - q, q) + 1;
        }
        else if(p < q){
            return 2 * Rational (p, q - p);
        }
        else
            return 1;
    }
}