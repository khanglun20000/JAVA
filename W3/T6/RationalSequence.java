import java.util.Scanner;

public class RationalSequence{
    public static int Rational(int p, int q)
    {
        if(q == 1){
            return p + 1;
        }
        else if (p < q){
            return q - p;
        }
        else if(p > q){
            int level = p / q;
            return (2 * level + 1) * q - p;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        for(int i = 0; i < P; i++){
            int order = sc.nextInt();
            String[] inputs = sc.next().split("/");
            int p = Integer.parseInt(inputs[0]);
            int q = Integer.parseInt(inputs[1]);
            System.out.print(order + " ");
            System.out.println(q + "/" + Rational(p, q));
        }

        sc.close();
    }
}