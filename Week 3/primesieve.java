import java.util.Scanner;
import java.util.BitSet;
public class primesieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc. nextInt();
        int q = sc.nextInt();

        BitSet array = sieve(n);
        for(int i = 0; i < q; i++) {
            if (array.get(sc.nextInt()))
            System.out.println(1);
            else System.out.println(0);
        }
        array = null;
        sc.close();

    }
    static BitSet sieve(int inputNumber) {
        BitSet array = new BitSet(inputNumber+1);
        int count = inputNumber-1;
        for (int i = 0; i < inputNumber+1; i++) {
            array.set(i, true);;
        }
        array.clear(0);
        array.clear(1);

        for (int i = 2; i * i < inputNumber+1; i++) {
            if (array.get(i) == true) {
                int multiple = 1;
                for (int j = i*i; j < inputNumber+1; j=i*multiple) {
                    if (j >= i*i) {
                        if (array.get(j) == true) {
                            array.clear(j);
                            count--;
                            multiple++;
                        }
                        else multiple++;
                    }
                    else multiple++;
                }
            } 
        }
        System.out.println(count);
        return array;
    }
}
