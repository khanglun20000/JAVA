import java.util.Scanner;

public class TouchScreen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCaseNum = sc.nextInt();

        String[] testCases = new String[testCaseNum];
        String[][] entriesList = new String[testCaseNum][];

        char[][] keyboardDigits = 
        {
        {'q','w','e','r','t','y','u','i','o','p'},
        {'a','s','d','f','g','h','j','k','l','#'},
        {'z','x','c','v','b','n','m','#','#','#'}
        };

        for(int i = 0; i < testCaseNum;i++){
            testCases[i] = sc.next();
            int entries = sc.nextInt();
            entriesList[i] = new String[entries];
            for(int j = 0; j < entries; j++){
                entriesList[i][j] = sc.next();
            }
        }

        sc.close();

        for(int i = 0; i < testCaseNum; i++){
            int[] distanceEach = new int[entriesList[i].length];
            for(int j = 0; j < entriesList[i].length; j++){
                distanceEach[j] = GetDistance(testCases[i], entriesList[i][j], keyboardDigits);
            }
            for(int j = 0; j < distanceEach.length; j++){
                int min = distanceEach[0];
                int index = 0;
                for(int k = 0; k < distanceEach.length; k++){
                    if(distanceEach[k] < min){
                        min = distanceEach[k];
                        index = k;
                    }
                    else if(distanceEach[k] == min){
                        for(int m = 0; m < entriesList[i][index].length(); m++){
                            if(entriesList[i][index].charAt(m) > entriesList[i][k].charAt(m)){
                                min = distanceEach[k];
                                index = k;
                            }
                        }
                    }
                }
                System.out.println(entriesList[i][index] + " " + distanceEach[index]);
                distanceEach[index] = 100;
            }
        }
    }

    public static int GetDistance(String entry, String checker, char[][] digits){
        int SumDistance = 0;
        for(int i = 0; i < entry.length();i++){
            //System.out.println("i = " + i);
            int Distance = 0;
            boolean found1 = false;
            int index1 = -1;
            boolean found2 = false;
            int j1 = 0, j2 = 0;

            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 10; k++){
                    if(found2 || found1) break;

                    if(entry.charAt(i) == digits[j][k]){
                        found1 = true;
                        index1 = k;
                        j1 = j;
                    }
                    else if(checker.charAt(i) == digits[j][k]){
                        found2 = true;
                        index1 = k;
                        j1 = j;
                    }
                }

                if(found1){
                    for(int a = 1; a < index1; a++){
                        if(digits[j][index1 - a] == checker.charAt(i)){
                            Distance += a;
                            //System.out.println("a == " + a + "j2 == " +j);
                            j2 = j;
                            found2 = true;
                            break;
                        }
                    }

                    if(!found2){
                        for(int b = 0; b < 10 - index1; b++){
                            if(digits[j][index1 + b] == checker.charAt(i)){
                                Distance += b;
                                //System.out.println("b == " + b + "j == " +j);
                                j2 = j;
                                break;
                            }
                        }
                    }
                }
                else if(found2){
                    for(int a = 1; a < index1; a++){
                        if(digits[j][index1 - a] == entry.charAt(i)){
                            Distance += a;
                            //System.out.println("a == " + a + "j == " +j);
                            j2 = j;
                            found1 = true;
                            break;
                        }
                    }

                    if(!found1){
                        for(int b = 0; b < 10 - index1; b++){
                            if(digits[j][index1 + b] == entry.charAt(i)){
                                Distance += b;
                                //System.out.println("b == " + b + "j == " +j);
                                j2 = j;
                                break;
                            }
                    }
                    }
                }
            }
            Distance += j2 - j1;
            //System.out.println("Distance = " + Distance);
            SumDistance += Distance;
        }
        return SumDistance;
    }
}