import java.util.Scanner;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;;

class node {
    int value;
    int parent;

    node(int value, int parent) {
        this.value = value;
        this.parent = parent;
    }
    @Override
    public boolean equals(Object o) {
 
        // If the object is compared with itself then return true 
        if (o == this) {
            return true;
        }
 
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof node)) {
            return false;
        }
         
        // typecast o to Complex so that we can compare data members
        node c = (node) o;
         
        // Compare the data members and return accordingly
        return value == c.value;
    }
}
public class primespiral {
    public static void main(String[] args) {
        int n = 40000;

        int n_level = (int) Math.sqrt(n);
        int array[][] = new int[n_level][n_level];

        BitSet checkarray = sieve(n);

        computeArray(n, n_level, array);

        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] numbers = line.split(" ");

            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            System.out.print("Case " +count+": ");
            if (checkarray.get(a) | checkarray.get(b)) {
                System.out.print("impossible\n");
            }
            else {
                Astar(array, a, b, n_level, checkarray);
            }
            count++;

        }
    }

    public static int[] findIndex(int a, int level) {
        int default_x1 = level/2;
        int default_y1 = default_x1 - 1;
        int x = 0;
        int y = 0;
        int k = (int) Math.ceil((Math.sqrt((double) a)-1)/2);
        int resultXY[] = new int[2];
        int t = (2 *  k) + 1;
        int m = t*t;
        t = t - 1;
        if (a >= m - t) {
            x = k - (m - a);
            y = - k;
            resultXY[0] = default_x1 - y  ;
            resultXY[1] = default_y1 + x;
            return resultXY;
        }
        else m=m-t;
        if (a >= m - t) {
            x = -k;
            y = -k + m - a;
            resultXY[0] = default_x1 - y  ;
            resultXY[1] = default_y1 + x;
            return resultXY;
        }
        else m=m-t;
        if (a >= m - t) {
            x = - k + m - a;
            y = k;
            resultXY[0] = default_x1 - y  ;
            resultXY[1] = default_y1 + x;
            return resultXY;
        }
        else {
            x = k;
            y = k - (m-a-t);
            resultXY[0] = default_x1 - y  ;
            resultXY[1] = default_y1 + x;
            return resultXY;
        }
    }

    public static int[][] computeArray(int n, int level, int[][] array) {
        int value = n;
        if(n % 2 == 0) {
            outerloop:
            for(int i = 0; i < level;i++) {

                
                for (int j = i; j < level; j++) {
                    
                    array[i][j] = value;
                    value--;
                    if (value == 0) break outerloop;
                    
                }
                for (int k = i+1; k < level; k++) {
                    
                    array[k][level-1] = value;
                    value--;
                    if (value == 0) break outerloop;
                }

                for (int l = level-1-1; l >= i; l--) {
                    
                        array[level-1][l] = value;
                    value--;
                    if (value == 0) break outerloop;
                    
                }

                for (int u = level-1-1; u > i ; u--) {
                    
                    array[u][i] = value;
                    value--;
                    if (value == 0) break outerloop;
            }
            level--;
        }

        }   
        return array;
    }
    public static BitSet sieve(int inputNumber) {
        BitSet array = new BitSet(inputNumber+1);
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
                            multiple++;
                        }
                        else multiple++;
                    }
                    else multiple++;
                }
            } 
        }
        return array;
    }

    public static void Astar(int matrix[][], int start, int end, int level, BitSet checkArray) {
        ArrayList <node> open = new ArrayList<node>();
        ArrayList <node> close = new ArrayList<node>();
        
        ArrayList <Integer> openWeight = new ArrayList<Integer>();
        ArrayList <Integer> closeWeight = new ArrayList<Integer>();

        node startingNode = new node(start, 0);

        open.add(startingNode);
        openWeight.add(calculateWeight(start, start, end, level));
        while(!open.isEmpty()) {
            int minIndexCurrent = openWeight.indexOf(Collections.min(openWeight));

            int minWeightCurrent = openWeight.get(minIndexCurrent);
            node minNodeCurrent = open.get(minIndexCurrent);


            openWeight.remove(minIndexCurrent);
            open.remove(minIndexCurrent);


            close.add(minNodeCurrent);
            closeWeight.add(minWeightCurrent);

            if (minNodeCurrent.value == end) {
                int count = 0;
                int index = close.size() - 1;
                while(index != 0) {
                    int priorValue = close.get(index).parent;
                    for(int j = 1; index - j >= 0; j++) {
                        if (priorValue == close.get(index-j).value) {
                            count++;
                            index = index - j;
                        }
                    }
                }
                System.out.print(count+"\n");
                return;
            }

            int currentIndex[] = findIndex(minNodeCurrent.value, level);
            int currentX = currentIndex[0];
            int currentY = currentIndex[1];

            if (currentX-1 >= 0) {
                int upperNeighbor = matrix[currentX-1][currentY];
                node neightbor = new node(upperNeighbor, minNodeCurrent.value);
                if (!checkArray.get(upperNeighbor) & !close.contains(neightbor)) {
        
                    int weight = calculateWeight(upperNeighbor, upperNeighbor, end, level);

                    if(!open.contains(neightbor) | calculateWeight(minNodeCurrent.value, minNodeCurrent.value, end, level) > weight) {
                        neightbor.parent = minNodeCurrent.value;
                        if (!open.contains(neightbor)) {
                            open.add(neightbor);
                            openWeight.add(weight);
                        }
                    }
                    else if(!open.contains(neightbor) & !close.contains(neightbor)) {
                        open.add(neightbor);
                        openWeight.add(calculateWeight(start, neightbor.value, end, level));
                    }
                }
            }

            if (currentX+1 <= level-1) {
                int lowerNeighbor = matrix[currentX+1][currentY];
                node neightbor = new node(lowerNeighbor, minNodeCurrent.value);

                if (!checkArray.get(lowerNeighbor) & !close.contains(neightbor)) {
                    int weight = calculateWeight(lowerNeighbor, lowerNeighbor, end, level);

                    if(!open.contains(neightbor) | calculateWeight(minNodeCurrent.value, minNodeCurrent.value, end, level) > weight) {
                        neightbor.parent = minNodeCurrent.value;
                        if (!open.contains(neightbor)) {
                            open.add(neightbor);
                            openWeight.add(weight);
                        }
                    }
                    else if(!open.contains(neightbor) & !close.contains(neightbor)) {
                        open.add(neightbor);
                        openWeight.add(calculateWeight(start, neightbor.value, end, level));
                    }
                }
            }

            if (currentY+1 <= level-1) {
                int rightNeighbor = matrix[currentX][currentY+1];
                node neightbor = new node(rightNeighbor, minNodeCurrent.value);

                if (!checkArray.get(rightNeighbor) & !close.contains(neightbor)) {
                    int weight = calculateWeight(rightNeighbor, rightNeighbor, end, level);

                    if(!open.contains(neightbor) | calculateWeight(minNodeCurrent.value, minNodeCurrent.value, end, level) > weight) {
                        neightbor.parent = minNodeCurrent.value;
                        if (!open.contains(neightbor)) {
                            open.add(neightbor);
                            openWeight.add(weight);
                        }
                    }
                    else if(!open.contains(neightbor) & !close.contains(neightbor)) {
                        open.add(neightbor);
                        openWeight.add(calculateWeight(start, neightbor.value, end, level));
                    }
                }
            }
            if (currentY-1 >= 0) {
                int leftNeighbor = matrix[currentX][currentY-1];
                node neightbor = new node(leftNeighbor, minNodeCurrent.value);

                if (!checkArray.get(leftNeighbor) & !close.contains(neightbor)) {
                    int weight = calculateWeight(leftNeighbor, leftNeighbor, end, level);


                    if(!open.contains(neightbor) | calculateWeight(minNodeCurrent.value, minNodeCurrent.value, end, level) > weight) {
                        neightbor.parent = minNodeCurrent.value;
                        if (!open.contains(neightbor)) {
                            open.add(neightbor);
                            openWeight.add(weight);
                        }
                    }
                    else if(!open.contains(neightbor) & !close.contains(neightbor)) {
                        open.add(neightbor);
                        openWeight.add(calculateWeight(start, neightbor.value, end, level));
                    }
                }
            }
        }
        System.out.print("impossible\n");
        return;

    
    }

    public static int calculateWeight(int start, int current, int end, int level) {
        int startIndex[] = findIndex(start, level);
        int startX = startIndex[0];
        int startY = startIndex[1];

        int endIndex[] = findIndex(end, level);
        int endX = endIndex[0];
        int endY = endIndex[1];

        int currentIndex[] = findIndex(current, level);
        int currentX = currentIndex[0];
        int currentY = currentIndex[1];

        int gx = Math.abs(startX - currentX) + Math.abs(startY - currentY);
        int hx = Math.abs(endX - currentX) + Math.abs(endY - currentY);

        return gx + hx;
    }
    
}
