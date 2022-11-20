import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Zoo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            int lineNum = sc.nextInt();
            if(lineNum == 0) break;
            sc.nextLine();

            String[] names = new String[lineNum];

            for(int j = 0; j < lineNum; j++){
                names[j] = sc.nextLine();
                String[] breakdown = names[j].split(" ");
                names[j] = breakdown[breakdown.length - 1].toLowerCase();
            }

            List<String> list = new LinkedList<String>(Arrays.asList(names));
            Collections.sort(list);
            list.add("null");
            //System.out.println(list);
            int count = 1;
            System.out.println("List " + (i + 1) + ":");

            for(int j = 0; j < list.size(); j++){
                if(list.get(j).equals("null")){
                    break;
                }

                if(list.get(j).equals(list.get(j + 1))){
                    count++;
                }
                else{
                    System.out.println(list.get(j) + " | " + count);
                    count = 1;
                }
            }

        }

        sc.close();
    }
}