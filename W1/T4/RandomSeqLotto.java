public class RandomSeqLotto {
    public static void main(String[] args) {

        // command-line argument\
        int a = 1;
        int b = 12;
        int n = 6;
        
        int array[] = new int [n + 1];
        array[0] = 50;
        int range = b - a;
        boolean check = false;
        int generated_number = 0;
        // generate and print n numbers between 0 and 1
        for (int i = 0; i < n; i++) {
            while(!check) {
                generated_number = (int) ((Math.random() * range) + a);
                if (check(generated_number, array, i+1)) {
                    check = true;
                }
            }
            System.out.println(generated_number);
            check = false;
            array[i] = generated_number;
        }
    }

    public static boolean check(int x, int array[], int i) {
        for (int j = 0; j < i; j++) {
            if (array[j] == x) {
                System.out.println("Identical number: " + x);
                return false;
            }
        }

        return true;
    }
}