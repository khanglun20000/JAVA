package Kattis2;

import java.util.Arrays;
import java.util.Scanner;

public class RailroadMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCaseNum = sc.nextInt();

        int[] N = new int[testCaseNum];
        int[] M = new int[testCaseNum];
        int[][] a = new int[testCaseNum][];
        int[][] b = new int[testCaseNum][];
        int[][] c = new int[testCaseNum][];

        for(int i = 0; i < testCaseNum; i++){
            N[i] = sc.nextInt();
            M[i] = sc.nextInt();

            a[i] = new int[M[i]];
            b[i] = new int[M[i]];
            c[i] = new int[M[i]];

            for(int j = 0; j < M[i]; j++){
                a[i][j] = sc.nextInt();
                b[i][j] = sc.nextInt();
                c[i][j] = sc.nextInt(); 
            }
        }

        sc.close();

        for(int i = 0; i < testCaseNum; i++){
            int[] stationFreq = new int[N[i]];
            int[] toEliminateStation = new int[N[i]];

            Arrays.fill(toEliminateStation, 0);
            Arrays.fill(stationFreq, 0);

            int newN = N[i];

            for(int k = 0; k < M[i]; k++){
                stationFreq[a[i][k] - 1]++ ;
                stationFreq[b[i][k] - 1]++ ;
            }

            for(int j = 0; j < N[i]; j++){
                if(stationFreq[j] == 2){
                    toEliminateStation[j] = j + 1;
                    newN--;
                }
            }

            // System.out.println("----");
            // for(int j = 0; j < N[i]; j++){
            //     System.out.println(toEliminateStation[j]);
            // }
            // System.out.println("------");

            int[] newa = a[i];
            int[] newb = b[i];
            int[] newc = c[i];

            for(int l = 0; l < N[i] - newN; l++){
                tag:
                for(int k = 0; k < toEliminateStation.length; k++){
                    int indexa = -1;
                    int indexb = -1;
                    boolean founda = false, foundb = false;
                    for(int j = 0; j < M[i]; j++){
                        if(toEliminateStation[k] > 0 && toEliminateStation[k] == newa[j]){
                            newa[j] = 0;
                            indexa = j;
                            founda = true;
                        }
                        if(toEliminateStation[k] > 0 && toEliminateStation[k] == newb[j]){
                            newb[j] = 0;
                            indexb = j;
                            foundb = true;
                        }

                        if(founda && foundb){
                            founda = false;
                            foundb = false;
                            newb[indexb] = newb[indexa];
                            newb[indexa] = 0;
                            newc[indexb] += newc[indexa];
                            break tag;
                        }
                    }
                }
            }


            System.out.println("OUTPUT");
            int newM = 0;
            for(int j = 0; j < newa.length; j++){
                if(newa[j] != 0 && newb[j] != 0){
                    newM++;
                }
            }
            
            System.out.println(newM);
            for(int j = 0; j < newa.length; j++){
                if(newa[j] != 0 && newb[j] != 0){
                    System.out.println(newa[j] + " " + newb[j] + " " + newc[j]);
                }
            }
            System.out.println();
        }
    }
}