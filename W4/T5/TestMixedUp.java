import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class TestMixedUp {
    public static void main(String[] args) {
        boolean same = true;
        String text1 = new String();
        String text2 = new String();

        try {
            File textFile = new File("text1.in");
            Scanner sc = new Scanner(textFile);
            
            while (sc.hasNextLine()) {
                text1 = sc.nextLine();
            }
            
            sc.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error!");
        }

        try {
            File textFile = new File("text2.txt");
            Scanner sc = new Scanner(textFile);
            
            while (sc.hasNextLine()) {
                text2 = sc.nextLine();
            }
            
            sc.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error!");
        }

        if(text1.length() != text2.length()){
            same = false;
            System.out.println("NO");
        }

        String[] strings1 = text1.split(" ");
        String[] strings2 = text2.split(" ");


        for(int i = 0; i < strings1.length; i++){
            if(!same) break;

            if(strings1[i].length() != strings2[i].length()){
                same = false;
                break;
            }

            if(strings1.length < 2) continue;

            int indexLast = strings1[i].charAt(strings1[i].length() - 1) < 65 ||  strings1[i].charAt(strings1[i].length() - 1) > 90 && strings1[i].charAt(strings1[i].length() - 1) < 97 || strings1[i].charAt(strings1[i].length() - 1) > 122 ?
            strings1[i].length() - 2 : strings1[i].length() - 1;

            if(strings1[i].charAt(0) != strings2[i].charAt(0)) {
                same = false;
                break;
            }

            char last1 = strings1[i].charAt(indexLast);
            char special1 = strings1[i].charAt(strings1[i].length() - 1);
            String lastString1 = last1 + "" + special1 ;

            char last2 = strings2[i].charAt(indexLast);
            char special2 = strings2[i].charAt(strings2[i].length() - 1);
            String lastString2 = last2 + "" + special2 ;

            if(!lastString1.equals(lastString2)) {
                same = false;
                break;
            }

            char[] chars1 = new char[strings1[i].length() - 2];
            char[] chars2 = new char[strings1[i].length() - 2];

            // System.out.println(strings1[i]);
            // System.out.println(strings2[i]);
            // System.out.println();

            for(int j = 1; j < strings1[i].length() - 1; j++){
                if(j != indexLast){
                    chars1[j - 1] = strings1[i].charAt(j);
                    chars2[j - 1] = strings2[i].charAt(j);
                }
                else break;
            }

            Arrays.sort(chars1);
            Arrays.sort(chars2);

            if(!Arrays.equals(chars1, chars2)){
                same = false;
                break;
            }
        }

        if(same)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
