/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Boat Parts
* Link: https://open.kattis.com/contests/uk27ry/problems/boatparts
* @author Khang
* @version 1.0, 11/07/2022
* 
* Method : ArrayList
* Status : Accepted
* Runtime: 0.13
*/

import java.util.Scanner;
import java.util.HashSet;

public class BoatParts{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int N = sc.nextInt();

        String[] boatPartsBought = new String[N];
        for(int i = 0; i < N; i++){
            boatPartsBought[i] = sc.next();
        }

        sc.close();

        HashSet<String> distincts = new HashSet<>(P);
        int lastday = 0;
        for(int i = 0; i < N; i++){
            if(!distincts.contains(boatPartsBought[i])){
                distincts.add(boatPartsBought[i]);
                lastday = i;
            }   
        }

        if(distincts.size() < P){
            System.out.println("Paradox avoided");
        }
        else{
            System.out.println(lastday + 1);
        }
    }
}