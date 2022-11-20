public class RandomSeqAB {
    public static void main(String[] args) {

        // command-line argument\
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);

        int range = b - a;
        // generate and print n numbers between 0 and 1
        for (int i = 0; i < n; i++) {
            System.out.println((int) (Math.random() * range) + a);
        }
    }
}