import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Goldbach {
    static int MAX_SIZE = 32000;  
    static ArrayList<Integer> primelist = new ArrayList<Integer>();  

    static void findnthPrimeNumber(){   
        boolean [] IsPrime = new boolean[MAX_SIZE];  

        Arrays.fill(IsPrime, true);

        for (int p = 2; p * p < MAX_SIZE; p++)   
        {   
            if (IsPrime[p] == true){   
                for (int i = p * p; i < MAX_SIZE; i += p)   
                    IsPrime[i] = false;   
            }   
        }   

        for (int p = 2; p < MAX_SIZE; p++)   
            if (IsPrime[p] == true)    
                primelist.add(p);  
    }   
    public static void main(String[] args) {
        findnthPrimeNumber();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            int[] couple = new int[array[i] / 2];
            Arrays.fill(couple, 0);

            int count = 0;

            for(int j = 0; j < array[i] / 2; j++){
                if(array[i]/2 - primelist.get(j) < 0)
                    break;

                if(primelist.contains(array[i] - primelist.get(j))){
                    couple[count] = primelist.get(j);
                    count++;
                }
            }

            System.out.println(array[i] + " has " + count + " representation(s)");

            for(int p = 0; p < count; p++){
                System.out.println(couple[p] + "+" + (array[i] - couple[p]));
            }

            System.out.println();
        }
    }
}
