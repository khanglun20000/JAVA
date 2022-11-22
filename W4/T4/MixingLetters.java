import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.*;

public class MixingLetters {
    public static void main(String[] args) {
        String data = new String();

        try {
            File myObj = new File("text.in");

            Scanner sc = new Scanner(myObj);

            while (sc.hasNextLine()) {
              data = sc.nextLine();
            }
            
            sc.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error!");
        }

        String[] strings = data.split(" ");
       
        for(int i = 0; i < strings.length; i++){
            char first = strings[i].charAt(0);
            int indexLast = strings[i].charAt(strings[i].length() - 1) < 65 ||  strings[i].charAt(strings[i].length() - 1) > 90 && strings[i].charAt(strings[i].length() - 1) < 97 || strings[i].charAt(strings[i].length() - 1) > 122 ?
            strings[i].length() - 2 : strings[i].length() - 1;
            char last = strings[i].charAt(indexLast);
            char special = strings[i].charAt(strings[i].length() - 1);
            String lastString = last + "" + special ;
            strings[i] = first + shuffleArray(strings[i].substring(1, indexLast).toCharArray()) + (indexLast == strings[i].length() - 1 ? last : lastString);
        }
        
        String output = String.join(" ", strings);
        System.out.println(output);

        try {
            FileWriter myWriter = new FileWriter("text.out");
            myWriter.write(output);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
          }
    }    

    private static String shuffleArray(char[] array)
    {
        List<Character> list = new ArrayList<>();
        for (char a : array)
            list.add(a);
        Collections.shuffle(list, new Random());
        return list.stream().map(Object::toString).collect(Collectors.joining(""));
    }
}
