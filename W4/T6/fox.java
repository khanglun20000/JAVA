import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Objects;

public class fox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            String firstLine = sc.nextLine();
            String[] sounds = firstLine.split(" ");

            ArrayList<String> listSound = new ArrayList<String>();
            for (int k = 0; k < sounds.length; k++) {
                listSound.add(sounds[k]);
            }


            outerloop:
            while(true) {
                String line = sc.nextLine();
                String[] animalsounds = line.split(" ");

                if(Objects.equals(animalsounds[2], "the")) {
                    for(int m = 0; m < listSound.size(); m++) {
                        
                        System.out.print(listSound.get(m) + " ");
                    }
                    break outerloop;
                }
                String sound = animalsounds[2];
                listSound.removeIf(p -> p.equals(sound));     
                
            }            
        }
        
        sc.close();
        return;
    }
}
